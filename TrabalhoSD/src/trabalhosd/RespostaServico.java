/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosd;

import java.io.Serializable;

/**
 *
 * @author matheus
 */
public class RespostaServico implements Serializable {

    private String doenca;
    private double conf;

    public String getDoenca() {
        return doenca;
    }
    
    public double getConf() {
        return conf;
    }

    public void setCodigo(String doenca, double conf) {
        this.doenca = doenca;
        this.conf = conf;
    }


}
