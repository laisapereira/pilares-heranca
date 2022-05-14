package com.mycompany.heranca.consultor;

public class ConsultorFinanceiro extends Consultor{

    private boolean credenciadoAnbima;

    public ConsultorFinanceiro(boolean credenciadoAnbima) {
        this.credenciadoAnbima = credenciadoAnbima;
    }

    public void consultarDividas(){
        System.out.println("Atualmente não existem dívidas!");
        System.out.println("");
    }

    public void recomendarInvestimento(){
        System.out.println("Carteira de investimentos e ativos está no limite! Não necessita de rebalanceamento.");
        System.out.println("");
    }

    public void analisarFluxoDeCaixa(){
        System.out.println("Analisando fluxo de caixa...");
        System.out.println("Aguarde...");
        System.out.println("Fluxo de caixa analisado!");
        System.out.println("");
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
