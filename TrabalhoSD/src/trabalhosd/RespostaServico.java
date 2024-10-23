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
    private int x;
    private double conf;

    public String getDoenca() {
        return doenca;
    }
    
    public int getX() {
        return x;
    }
    
    public double getConf() {
        return conf;
    }

    public void setCodigo(String doenca, int x, double conf) {
        this.doenca = doenca;
        this.x = x;
        this.conf = conf;
    }


}
