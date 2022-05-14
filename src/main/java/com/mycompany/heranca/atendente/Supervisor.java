
package com.mycompany.heranca.atendente;


public class Supervisor extends Atendente {
    private String[] setoresResponsavel;
    
    
    public void aceitarRelatorio() {
        
    }

    public Supervisor(String[] setoresResponsavel) {
        this.setoresResponsavel = setoresResponsavel;
    }

    public String[] getSetoresResponsavel() {
        return setoresResponsavel;
    }

    public void setSetoresResponsavel(String[] setoresResponsavel) {
        this.setoresResponsavel = setoresResponsavel;
    }
    
    
    
}
