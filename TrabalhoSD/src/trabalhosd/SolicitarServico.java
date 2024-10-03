/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosd;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class SolicitarServico implements Serializable {
    private int codigo;
    private ArrayList<Integer> listaSintomas = null;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Integer> getListaSintomas() {
        return listaSintomas;
    }

    public void setListaSintomas(ArrayList<Integer> listaSintomas) {
        this.listaSintomas = listaSintomas;
    }
    
    
    
   
}
