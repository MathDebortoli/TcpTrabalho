/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhosd;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author matheus
 */
public class TcpCliente {

    private static final int DATA = 1;
    private static final int HORA = 2;
    private static final int PORTA_SERVICO = 2000;

    public static void main(String[] args) {
        String nomeServidor = "matheus-lenovo";
        int operacaoSolicitada = HORA;
        Socket socket = null;
        InetAddress enderecoServidor = null;
        SolicitarServico solicitacao;
        Object resposta;

        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;

        //Validar Operacao;
        if (operacaoSolicitada != DATA && operacaoSolicitada != HORA) {
            System.out.println("Serviço Nao Implementado!");
            return;
        }

        //Criar solicitacao de servico
        solicitacao = new SolicitarServico();

        //Especificar o servio solicitado
        solicitacao.setCodigo(operacaoSolicitada);

        try {
            enderecoServidor = InetAddress.getByName(nomeServidor);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            socket = new Socket(enderecoServidor, PORTA_SERVICO);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            objectOutputStream.writeObject(solicitacao);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        //Aguardando Resposta
        try {
            resposta = (RespostaServico) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Isso ajudará a identificar exatamente onde o erro ocorre
            System.out.println(e.getMessage());
            // Isso ajudará a identificar exatamente onde o erro ocorre
            return;
        }

        //Fechar o ponto de transpote
        try {
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        //Apresentar resposta
        if (resposta instanceof RespostaServico) {
            if (solicitacao.getCodigo() == DATA) {
                System.out.print("DATA " + ((RespostaServico) resposta).getDia());
                System.out.println("/" + (((RespostaServico) resposta).getMes() + 1));
            } else if (solicitacao.getCodigo() == HORA) {
                System.out.print("HORA " + ((RespostaServico) resposta).getHora());
                System.out.println(":" + ((RespostaServico) resposta).getMinuto());
            }

        } else if (resposta instanceof ServicoNaoImplementado) {
            System.out.println("Serviço Nao Implementado");
        }
    }

}
