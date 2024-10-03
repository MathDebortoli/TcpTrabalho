/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosd;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Discrminador {

    ArrayList<Integer> entrada = null;

    ArrayList<Integer> ram1 = null;
    ArrayList<Integer> ram2 = null;
    ArrayList<Integer> ram3 = null;
    ArrayList<Integer> ram4 = null;
    ArrayList<Integer> ram5 = null;

    public Discrminador() {
        ram1 = new ArrayList(4);
        ram2 = new ArrayList(4);
        ram3 = new ArrayList(4);
        ram4 = new ArrayList(4);
        ram5 = new ArrayList(4);
    }

    public void inicializarRam(ArrayList<Integer> ram) {
        ram.set(0, 0);
        ram.set(1, 0);
        ram.set(2, 0);
        ram.set(3, 0);
    }

    public void setEntrada(ArrayList<Integer> entrada) {
        this.entrada = entrada;
    }

    public int transformarBinario(int num1, int num2) {
        String juntos = "" + num1 + num2;
        return Integer.parseInt(juntos, 2);
    }

    public void preencherRam(ArrayList<Integer> ram) {
        int valor1, valor2, valor3, valor4, valor5, aux = 0;

        valor1 = transformarBinario(entrada.get(0), entrada.get(3));
        valor2 = transformarBinario(entrada.get(5), entrada.get(7));
        valor3 = transformarBinario(entrada.get(9), entrada.get(1));
        valor4 = transformarBinario(entrada.get(4), entrada.get(6));
        valor5 = transformarBinario(entrada.get(8), entrada.get(2));

        ram.set(valor1, ram.get(valor1) + 1);
        ram.set(valor2, ram.get(valor2) + 1);
        ram.set(valor3, ram.get(valor3) + 1);
        ram.set(valor4, ram.get(valor4) + 1);
        ram.set(valor5, ram.get(valor5) + 1);

    }

}
