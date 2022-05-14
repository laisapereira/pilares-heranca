package com.mycompany.heranca.consultor;

public class ConsultorJuridico extends Consultor{

    private String cnaOab;
    private String nicho;

    public ConsultorJuridico(String cnpj, String formacaoPrincipal, String cnaOab, String nicho) {
        super(cnpj, formacaoPrincipal);
        this.cnaOab = cnaOab;
        this.nicho = nicho;
    }

    public void consultarProcesso(){
        System.out.println("Consultando processo...");
        System.out.println("Aguarde...");
        System.out.println("O processo ainda está em fase de análise pelo cartório!");
        System.out.println("");
    }

    public void abrirProcesso(){
        System.out.println("Abrindo processo...");
        System.out.println("Aguarde...");
        System.out.println("Processo aberto!");
        System.out.println("");
    }

    public String getCnaOab() {
        return cnaOab;
    }

    public void setCnaOab(String cnaOab) {
        this.cnaOab = cnaOab;
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    @Override
    public String getCnpj() {
        return super.getCnpj();
    }

    @Override
    public void setCnpj(String CNPJ) {
        super.setCnpj(cnpj);
    }

    @Override
    public String getFormacaoPrincipal() {
        return super.getFormacaoPrincipal();
    }

    @Override
    public void setFormacaoPrincipal(String formacaoPrincipal) {
        super.setFormacaoPrincipal(formacaoPrincipal);
    }
}
