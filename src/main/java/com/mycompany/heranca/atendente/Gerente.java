

package com.mycompany.heranca.atendente;


import com.mycompany.heranca.interfaces.ILider;

public class Gerente extends Atendente implements ILider {
    private String responsavel;
    private String senioridade;
    private String turno;
    
    
     public Gerente(String responsavel, String senioridade, String turno) {
        this.responsavel = responsavel;
        this.senioridade = senioridade;
        this.turno = turno;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void alocarAtendentes() {
        
    }

    public void alterarCargaHoraria(){
        
    }


    @Override
    public void solicitarDesligamento() {

    }

    @Override
    public void rotacionarFuncionarios() {

    }
}
