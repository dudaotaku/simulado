package org.example;

public class FolhaProntuario {
    private Empresa empresa;
    private Paciente paciente;
    private Prontuario prontuario;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append(FormatadorUtil.alinha(this.empresa.getNomeFantasia(), 60, FormatadorUtil.Direcao.ESQUERDA));
        sb.append(System.lineSeparator());
        String endereco = String.format( ""this.empresa.getEndereco().getLogradouro("Av.Prof.Lineu Prestes"),this.empresa.getEndereco().getNumero("2565"), this.empresa.getEndereco().getBairro("Cidade Universitaria"), this.empresa.getEndereco().getCidade("São Paulo/"), this.empresa.getEndereco().getEstado("SP"));


    }
}
