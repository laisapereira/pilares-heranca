
package com.mycompany.heranca.atendente;


import com.mycompany.heranca.interfaces.ILider;

public class Supervisor extends Atendente implements ILider {
    private String[] setoresResponsavel;
    
    
    public void aceitarRelatorio() {
        
    }

    public Supervisor(String[] setoresResponsavel, String setor, int cargaHoraria) {
        super(setor, cargaHoraria);
        this.setoresResponsavel = setoresResponsavel;
    }

    public String[] getSetoresResponsavel() {
        return setoresResponsavel;
    }

    public void setSetoresResponsavel(String[] setoresResponsavel) {
        this.setoresResponsavel = setoresResponsavel;
    }


    @Override
    public void solicitarDesligamento() {
        System.out.println("hello world");
    }

    @Override
    public void rotacionarFuncionarios() {

    }
}
