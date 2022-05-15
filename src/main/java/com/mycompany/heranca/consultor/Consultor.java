package com.mycompany.heranca.consultor;

abstract class Consultor {
    public String cnpj;
    public String formacaoPrincipal;

    public Consultor(String cnpj, String formacaoPrincipal) {
        this.cnpj = cnpj;
        this.formacaoPrincipal = formacaoPrincipal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFormacaoPrincipal() {
        return formacaoPrincipal;
    }

    public void setFormacaoPrincipal(String formacaoPrincipal) {
        this.formacaoPrincipal = formacaoPrincipal;
    }
}
