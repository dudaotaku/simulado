package org.example;

import java.util.Date;

public class Prontuario {
    private String responsavel;
    private String crf;
    private String matricula;
    private Date dataSolicitacao;

    public String getResponsavel() {
        return responsavel;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
