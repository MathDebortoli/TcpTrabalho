/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ghabriel
 */
public class Avaliador {
    
    private static int totalPrevisoes = 0; 
    private static int totalPrevisoesCorretas = 0;
    private static int totalFalsosPositivos = 0;
    private static int totalFalsosNegativos = 0;
    
    
    private List<Discriminador> discriminadores;
    
    Avaliador(List<Discriminador> disc){
        this.discriminadores = disc;
    }
    
    public int avaliar(ArrayList<Integer> entrada){
        
        int doencaResposta = 0;
        int bleaching = 3;
        int indiceDoenca = 0;
        
        totalPrevisoes++;
        
        int maiorChance = 0;
        
        ArrayList<Integer> somas = new ArrayList<>();
        
        for(int i = 0; i < discriminadores.size(); i++) {
            somas.add(0); // Adiciona 0 para cada discriminador
        }
        
        int valor1, valor2, valor3, valor4, valor5;

        
        
        // Transformando pares de valores em índices binários
        valor1 = transformarBinario(entrada.get(0), entrada.get(3));
        valor2 = transformarBinario(entrada.get(5), entrada.get(7));
        valor3 = transformarBinario(entrada.get(9), entrada.get(1));
        valor4 = transformarBinario(entrada.get(4), entrada.get(6));
        valor5 = transformarBinario(entrada.get(8), entrada.get(2));
        
       
        
        // Percorrer cada discriminador(Gripe, Gravidez...)
        for(Discriminador doenca : discriminadores){
               
            // Percorrer cada Ram gravada para validar o calculo
            List<ArrayList<Integer>> ram = doenca.getRams();
            
            somas.set(indiceDoenca, somas.get(indiceDoenca) + ram.get(0).get(valor1));
            somas.set(indiceDoenca, somas.get(indiceDoenca) + ram.get(1).get(valor2));
            somas.set(indiceDoenca, somas.get(indiceDoenca) + ram.get(2).get(valor3));
            somas.set(indiceDoenca, somas.get(indiceDoenca) + ram.get(3).get(valor4));
            somas.set(indiceDoenca, somas.get(indiceDoenca) + ram.get(4).get(valor5));
            
            System.out.println("Avaliou");

            for(int i = 0; i < 5; i++)
                System.out.println("O somatório da doenca " + i + " foi de: " + somas.get(i));
            
            
            indiceDoenca++;
        }
        
        
        indiceDoenca = 0;
        for(Integer soma : somas){
            if(soma > maiorChance){
                maiorChance = soma;
                doencaResposta = indiceDoenca;
            }
            
            indiceDoenca++;
        }
        
        switch(doencaResposta){
            case 0: System.out.println("Diagnostico: Gripe"); break;
            case 1: System.out.println("Diagnostico: Gravidez"); break;
            case 2: System.out.println("Diagnostico: Virose"); break;
            case 3: System.out.println("Diagnostico: Intestino"); break;
            case 4: System.out.println("Diagnostico: Ouvido"); break;
            
        }

        return doencaResposta;
        
    }
    
    public int transformarBinario(int num1, int num2) {
        String juntos = "" + num1 + num2;
        return Integer.parseInt(juntos, 2); // Convertendo a String para número binário
    }
    
    public static void previsaoCorreta(){
        totalPrevisoesCorretas++;
    }
    public static void falsoPositivo(){
        totalFalsosPositivos++;
    }
    public static void falsoNegativo(){
        totalFalsosNegativos++;
    }
               
    public static double getConfiabilidade(){
        if(totalPrevisoes == 0){
            return 0;
        }
        System.out.println("Prev "+totalPrevisoes);
        System.out.println("PrevCorreto "+totalPrevisoesCorretas);
        double x = (double)totalPrevisoesCorretas / (double)totalPrevisoes;        
        System.out.println(x);
        return  x * 100;
    }
    
    public static double getPrecisao(){
        return totalPrevisoesCorretas / totalPrevisoesCorretas + totalFalsosPositivos;
    }
    
    public static double getRecall(){
        return totalPrevisoesCorretas / totalPrevisoesCorretas + totalFalsosNegativos;
    }
    
    public static double getF1Score(){
        return 2 * ((getPrecisao() * getRecall()) / (getPrecisao() + getRecall()));
        
    }
}