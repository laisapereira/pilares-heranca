package com.mycompany.heranca.consultor;

public class ConsultorDeVendas extends Consultor{
    private int qtdVendas;
    private String produtoPrincipal;

    public ConsultorDeVendas(int qtdVendas, String produtoPrincipal) {
        this.qtdVendas = qtdVendas;
        this.produtoPrincipal = produtoPrincipal;
    }

    public void venderProduto(){
        this.qtdVendas++;
        System.out.print(produtoPrincipal + " foi vendido!");
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public String getProdutoPrincipal() {
        return produtoPrincipal;
    }

    public void setProdutoPrincipal(String produtoPrincipal) {
        this.produtoPrincipal = produtoPrincipal;
    }

    @Override
    public String getCnpj() {
        return super.getCnpj();
    }

    @Override
    public void setCnpj(String cnpj) {
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
