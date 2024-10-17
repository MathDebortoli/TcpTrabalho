/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhosd;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author matheus
 */
public class TcpServidor{

    private static final int DATA = 1;
    private static final int HORA = 2;
    private static final int PORTA_SERVICO = 2000;
    Date data;
    Calendar calendario;
    ServerSocket serverSocket = null;

    //Discriminadores para as doencas
    Discriminador gripe;
    Discriminador gravidez;
    Discriminador virose;
    Discriminador infeccaoOuvido;
    Discriminador inffecaoIntestino;
    
    Avaliador avaliador;

    SolicitarServico solicitacao;
    Object resposta;

    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;
    //Cria-se o calendario

    public TcpServidor() {
        this.gripe = new Discriminador();
        this.virose = new Discriminador();
        this.gravidez = new Discriminador();
        this.infeccaoOuvido = new Discriminador();
        this.inffecaoIntestino = new Discriminador();
    }

    public void adicionarCliente(Socket socket) {
        new Thread(() -> {
            //Permanece prestando servico
            try {
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectInputStream = new ObjectInputStream(socket.getInputStream());
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }

            //Aguardando a recepçao da solicitacao
            try {
                solicitacao = (SolicitarServico) objectInputStream.readObject();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace(); // Isso ajudará a identificar exatamente onde o erro ocorre
                return;
            }

            resposta = new RespostaServico();
            ArrayList<Integer> listaSintomas = solicitacao.getListaSintomas();

            // Identifica a Doenca de acordo com o index do combobox.
            if (null != listaSintomas.get(10)) {
                switch (listaSintomas.get(10)) {
                    case 0 -> {
                        System.out.println("Gripe");
                        gripe.setEntrada(listaSintomas);
                        gripe.preencherRam();
                        gripe.imprimirRams();
                       
                            
                    }
                    case 1 -> {
                        System.out.println("Gravidez");
                        gravidez.setEntrada(listaSintomas);
                        gravidez.preencherRam();
                        gravidez.imprimirRams();
                    }
                    case 2 -> {
                        System.out.println("Virose");
                        virose.setEntrada(listaSintomas);
                        virose.preencherRam();
                        virose.imprimirRams();
                    }
                    case 3 -> {
                        System.out.println("inffecaointestinal");
                        inffecaoIntestino.setEntrada(listaSintomas);
                        inffecaoIntestino.preencherRam();
                        inffecaoIntestino.imprimirRams();
                    }
                    case 4 -> {
                        System.out.println("inffecaoouvido");
                        infeccaoOuvido.setEntrada(listaSintomas);
                        infeccaoOuvido.preencherRam();
                        infeccaoOuvido.imprimirRams();
                    }
                   
                    default -> {
                        System.out.println("Erro");
                    }
                }
                
                System.out.println("Realizar Avalicação");
                avaliador = new Avaliador(Arrays.asList(gripe,gravidez,virose,inffecaoIntestino,infeccaoOuvido));
                avaliador.avaliar(listaSintomas);
                
                Avaliador.getConfiabilidade();
                Avaliador.previsaoCorreta();
            }

            //Resposta de Sucesso 
            ((RespostaServico) resposta).setCodigo(1);

            //Enviar o objeto com a resposta
            try {
                objectOutputStream.writeObject(resposta);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
           
        finally{
            try{
                socket.close();
            }
            catch(IOException e){
                System.out.println("Erro!!");
            }
        }
        }).start();
    }
}
