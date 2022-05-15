
package com.mycompany.heranca.atendente;


import com.mycompany.heranca.interfaces.ILider;
import java.util.Arrays;

public class Supervisor extends Atendente implements ILider {
    private String[] setoresResponsavel;
    
    
 
    public void status() {
        System.out.println("Esse supervisor é responsavel pelos setores    "
        + Arrays.toString(this.getSetoresResponsavel()));
    }
    public void aceitarRelatorio() {
        System.out.println("Um novo relatorio foi entregue,"
                + " o supervisor vai aceitar");
        
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
        System.out.println("Solicitando desligamento...");
    }

    @Override
    public void rotacionarFuncionarios() {
        System.out.println("Apenas gerentes podem rotacionar funcionarios");
    }
}
