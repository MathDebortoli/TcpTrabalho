package trabalhosd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Discriminador {

    ArrayList<Integer> entrada;

    ArrayList<Integer> ram1;
    ArrayList<Integer> ram2;
    ArrayList<Integer> ram3;
    ArrayList<Integer> ram4;
    ArrayList<Integer> ram5;

    public Discriminador() {
        // Especificando o tipo genérico nas instâncias dos ArrayLists
        ram1 = new ArrayList<>();
        ram2 = new ArrayList<>();
        ram3 = new ArrayList<>();
        ram4 = new ArrayList<>();
        ram5 = new ArrayList<>();

        inicializarRam(ram1);
        inicializarRam(ram2);
        inicializarRam(ram3);
        inicializarRam(ram4);
        inicializarRam(ram5);
    }

    public void inicializarRam(ArrayList<Integer> ram) {
        // Inicializando os valores para garantir que todos os índices estão preenchidos
        for (int i = 0; i < 4; i++) {
            ram.add(0);
        }
    }

    public void setEntrada(ArrayList<Integer> entrada) {
        this.entrada = entrada;
    }

    public int transformarBinario(int num1, int num2) {
        String juntos = "" + num1 + num2;
        return Integer.parseInt(juntos, 2); // Convertendo a String para número binário
    }

    public void preencherRam() {
        int valor1, valor2, valor3, valor4, valor5, aux;

        // Transformando pares de valores em índices binários
        valor1 = transformarBinario(entrada.get(0), entrada.get(3));
        valor2 = transformarBinario(entrada.get(5), entrada.get(7));
        valor3 = transformarBinario(entrada.get(9), entrada.get(1));
        valor4 = transformarBinario(entrada.get(4), entrada.get(6));
        valor5 = transformarBinario(entrada.get(8), entrada.get(2));

        // Atualizando os valores das RAMs correspondentes
        aux = ram1.get(valor1) + 1;
        ram1.set(valor1, aux);

        aux = ram2.get(valor2) + 1;
        ram2.set(valor2, aux);

        aux = ram3.get(valor3) + 1;
        ram3.set(valor3, aux);

        aux = ram4.get(valor4) + 1;
        ram4.set(valor4, aux);

        aux = ram5.get(valor5) + 1;
        ram5.set(valor5, aux);
    }
    
    
    public List<ArrayList<Integer>> getRams(){
        return Arrays.asList(ram1,ram2,ram3,ram4,ram5);
    }
    
    public void imprimirRams() {
        // Imprimindo todas as RAMs para depuração
        System.out.println("RAM1: " + ram1);
        System.out.println("RAM2: " + ram2);
        System.out.println("RAM3: " + ram3);
        System.out.println("RAM4: " + ram4);
        System.out.println("RAM5: " + ram5);
        System.out.println("");
    }

}
