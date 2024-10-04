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
public class Discriminador {

    ArrayList<Integer> entrada = null;

    ArrayList<Integer> ram1 = null;
    ArrayList<Integer> ram2 = null;
    ArrayList<Integer> ram3 = null;
    ArrayList<Integer> ram4 = null;
    ArrayList<Integer> ram5 = null;

    public Discriminador() {
        ram1 = new ArrayList();
        ram2 = new ArrayList();
        ram3 = new ArrayList();
        ram4 = new ArrayList();
        ram5 = new ArrayList();

        inicializarRam(ram1);
        inicializarRam(ram2);
        inicializarRam(ram3);
        inicializarRam(ram4);
        inicializarRam(ram5);
    }

    public void inicializarRam(ArrayList<Integer> ram) {
        ram.add(0, 0);
        ram.add(1, 0);
        ram.add(2, 0);
        ram.add(3, 0);
    }

    public void setEntrada(ArrayList<Integer> entrada) {
        this.entrada = entrada;
    }

    public int transformarBinario(int num1, int num2) {
        String juntos = "" + num1 + num2;
        return Integer.parseInt(juntos, 2);
    }

    public void preencherRam() {
        int valor1, valor2, valor3, valor4, valor5;

        valor1 = transformarBinario(entrada.get(0), entrada.get(3));
        valor2 = transformarBinario(entrada.get(5), entrada.get(7));
        valor3 = transformarBinario(entrada.get(9), entrada.get(1));
        valor4 = transformarBinario(entrada.get(4), entrada.get(6));
        valor5 = transformarBinario(entrada.get(8), entrada.get(2));

        ram1.set(valor1, ram1.get(valor1) + 1);
        ram2.set(valor2, ram2.get(valor2) + 1);
        ram3.set(valor3, ram3.get(valor3) + 1);
        ram4.set(valor4, ram4.get(valor4) + 1);
        ram5.set(valor5, ram5.get(valor5) + 1);

    }

    public void imprimirRams() {
        System.out.println(ram1);
        System.out.println(ram2);
        System.out.println(ram3);
        System.out.println(ram4);
        System.out.println(ram5);
    }

}
