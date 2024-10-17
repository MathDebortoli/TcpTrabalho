/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosd;

import java.util.ArrayList;

/**
 *
 * @author umestudantecristao
 */
public class Diagnostico {
    
    ArrayList<Integer> entrada;
    public Diagnostico(ArrayList<Integer> entrada){
        this.entrada = entrada;
       
    }
    
    public Discriminador diagnosticoFinal(ArrayList<Discriminador> listaDoencas){
        int maior = 0;
        int aux = 0;
        Discriminador doenca = null;
        
        for(int i = 0; i < listaDoencas.size(); i++){
            aux = calcularDiagnóstico(listaDoencas.get(i));
            if(aux > maior){
                maior = aux;
                doenca = listaDoencas.get(i);
            }
        }
        
        return doenca;
    }
    
    
    private int calcularDiagnóstico(Discriminador doenca){
        int bleaching = 3;
        
        int valor1, valor2, valor3, valor4, valor5, somatorio = 0;

        // Transformando pares de valores em índices binários
        valor1 = doenca.transformarBinario(entrada.get(0), entrada.get(3));
        valor2 = doenca.transformarBinario(entrada.get(5), entrada.get(7));
        valor3 = doenca.transformarBinario(entrada.get(9), entrada.get(1));
        valor4 = doenca.transformarBinario(entrada.get(4), entrada.get(6));
        valor5 = doenca.transformarBinario(entrada.get(8), entrada.get(2));
        
        if(doenca.ram1.get(valor1) == bleaching){
            somatorio = somatorio + 1;
        }
        if(doenca.ram2.get(valor2) == bleaching){
            somatorio = somatorio + 1;
        }
        if(doenca.ram3.get(valor3) == bleaching){
            somatorio = somatorio + 1;
        }
        if(doenca.ram4.get(valor4) == bleaching){
            somatorio = somatorio + 1;
        }
        if(doenca.ram5.get(valor5) == bleaching){
            somatorio = somatorio + 1;
        }
        
        return somatorio;
    }
}
