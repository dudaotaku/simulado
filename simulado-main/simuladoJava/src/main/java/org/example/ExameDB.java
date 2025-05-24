package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ExameDB {
    private static HashMap<Integer, Exame> exames = new HashMap();

    public ExameDB() {
    }

    public static Exame buscaPorCodigo(Integer codigo) {
        return (Exame)exames.get(codigo);
    }

    static {
        try {
            Scanner s = new Scanner(new File("exames.csv"));
            s.nextLine();

            while(s.hasNext()) {
                String linha = s.nextLine();
                String[] colunas = linha.split(",");
                Exame exame = new Exame();
                exame.setCodigo(Integer.parseInt(colunas[0]));
                exame.setNomeExame(colunas[1]);
                exame.setTipoColeta(colunas[2]);
                exames.put(exame.getCodigo(), exame);
                System.out.println(linha);
            }

            System.out.println("Produtos carregados: " + exames.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo não encontrado");
        }

    }
}
