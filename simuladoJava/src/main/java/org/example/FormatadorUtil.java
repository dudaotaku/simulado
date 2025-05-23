package org.example;


import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

public class FormatadorUtil {
    public FormatadorUtil() {
    }

    public static String linha(int colunas) {
        return StringUtils.center("", colunas, "-");
    }

    public static String formataDecimal(double valor, int colunas) {
        String valorFormatado = String.format("%.2f", valor);
        return alinha(valorFormatado, colunas, FormatadorUtil.Direcao.DIREITA);
    }

    public static String formataInteiro(Integer valor, int colunas) {
        return StringUtils.leftPad(valor.toString(), colunas, "0");
    }

    public static String alinha(String conteudo, int colunas, Direcao direcao) {
        if (direcao == FormatadorUtil.Direcao.DIREITA) {
            return StringUtils.leftPad(conteudo, colunas);
        } else if (direcao == FormatadorUtil.Direcao.ESQUERDA) {
            return StringUtils.rightPad(conteudo, colunas);
        } else {
            return direcao == FormatadorUtil.Direcao.CENTRO ? StringUtils.center(conteudo, colunas) : conteudo;
        }
    }

    public static String formataDataPadrao(Date date) {
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        return formatData.format(date);
    }

    public static String formataDataHoraPadrao(Date date) {
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatData.format(date);
    }

    public static String formata(String formato, Date date) {
        SimpleDateFormat formatData = new SimpleDateFormat(formato);
        return formatData.format(date);
    }

        public static String formataIdade(Date dataNascimento) {
            Calendar hoje = Calendar.getInstance();
            Calendar nascimento = Calendar.getInstance();
            nascimento.setTime(dataNascimento);

            int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

            return idade + " anos";
        }


    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(formataDataPadrao(date));
        System.out.println(formata("d/M/y", date));
        System.out.println(formata("DD yyyy", date));
        System.out.println(formata("M yyyy", date));
        System.out.println(formata("MM yyyy", date));
        System.out.println(formata("MMM yyyy", date));
        System.out.println(formata("MMMM yyyy", date));
        System.out.println(formata("dd/MM/yyyy HH:mm:ss:SS", date));
        date = new Date();
        System.out.println(formata("dd/MM/yyyy HH:mm:ss:SS", date));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(cal.getTime());
        System.out.println("Ano: " + cal.get(1));
        System.out.println("Dias do ano: " + cal.get(6));
        System.out.println("Dia na semana: " + cal.get(7));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse("15/08/2000");
        System.out.println(formataIdade(dataNascimento));

        for(int i = 0; i < 10; ++i) {
            System.out.printf("%s é ano bissexto? %s\n", cal.get(1), Year.isLeap((long)cal.get(1)));
            cal.add(1, 1);
        }

        if (cal.get(7) == 6) {
            System.out.println("SEXTOU!!!");
        }

        System.out.println("Financiamento iniciou em: " + formataDataPadrao(cal.getTime()));
        cal.add(2, 36);
        System.out.println("Financiamento iniciou em: " + formataDataPadrao(cal.getTime()));
        LocalDateTime entrada = LocalDateTime.of(2025, 5, 8, 10, 25);
        LocalDateTime saida = LocalDateTime.now();
        Duration duracao = Duration.between(entrada, saida);
        System.out.println("Entrada: " + String.valueOf(entrada));
        System.out.println("Saida: " + String.valueOf(saida));
        System.out.println("Horas estacionado:" + duracao.toHours());
        System.out.println("Minutos estacionado:" + duracao.toMinutes());
        LocalDate nascimento = LocalDate.of(1983, 1, 22);
        LocalDate agora = LocalDate.now();
        agora = agora.plusYears(10L);
        Period total = Period.between(nascimento, agora);
        System.out.printf("Idade %s anos daqui a 10 anos\n", total.getYears());
        LocalDate hoje = LocalDate.now();
        LocalDate prova = hoje.plusWeeks(2L);
        System.out.println("Data da prova: " + String.valueOf(prova));
        System.out.println("Aula dia 16/05");
        System.out.println(alinha("TEM SUPERMERCADO", 60, Direcao.CENTRO));
        System.out.println(alinha("TEM SUPERMERCADO", 60, Direcao.DIREITA));
        System.out.println(alinha("TEM SUPERMERCADO", 60, Direcao.ESQUERDA));
        System.out.println(formataDecimal(12.32, 10));
        System.out.println(formataInteiro(19, 10));
        System.out.println(StringUtils.center("", 60, "-"));
        System.out.println(linha(100));
        System.out.println(linha(20));
        System.out.println("\n\n\n\n");
        String cabecalho = String.format("# %s %s %s %s %s %s", alinha("Código", 8, Direcao.DIREITA), alinha("Descrição", 11, Direcao.DIREITA), alinha("Qtde", 6, Direcao.DIREITA), alinha("Un", 4, Direcao.DIREITA), alinha("Valor unit.", 12, Direcao.DIREITA), alinha("Valor total", 12, Direcao.DIREITA));
        System.out.println(linha(60));
        System.out.println(cabecalho);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static enum Direcao {
        ESQUERDA,
        DIREITA,
        CENTRO;

        private Direcao() {
        }
    }
}
