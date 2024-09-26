/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcpservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author matheus
 */
public class TcpServidor {

    private static final int DATA = 1;
    private static final int HORA = 2;
    private static final int PORTA_SERVICO = 2000;

    public static void main(String[] args) {
        Date data;
        Calendar calendario;
        ServerSocket serverSocket = null;
        Socket socket = null;

        SolicitarServico solicitacao;
        Object resposta;

        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;

        //Cria-se o calendario
        calendario = new GregorianCalendar();

        //Criar o ponto de transporte para conexao
        try {
            serverSocket = new ServerSocket(PORTA_SERVICO);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        //Permanece prestando servico
        while (true) {
            //Aguardar a Conexao.
            try {
                socket = serverSocket.accept();
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
            
            System.out.println("tatu");
            
            //Aguardando a recepçao da solicitacao
            try {
                solicitacao = (SolicitarServico) objectInputStream.readObject();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
            
            System.out.println("fazuesale");

            resposta = new RespostaServico();

            //Identificar e privendicar o serviço solicitado.
            data = new Date();
            calendario.setTime(data);

            if (solicitacao.getCodigo() == DATA) {
                ((RespostaServico) resposta).setDia(calendario.get(Calendar.DATE));
                ((RespostaServico) resposta).setMes(calendario.get(Calendar.MONTH));
            }

            if (solicitacao.getCodigo() == HORA) {
                ((RespostaServico) resposta).setHora(calendario.get(Calendar.HOUR));
                ((RespostaServico) resposta).setMinuto(calendario.get(Calendar.MINUTE));
            }

            if (solicitacao.getCodigo() != DATA && solicitacao.getCodigo() != HORA) {
                resposta = new ServicoNaoImplementado();
                ((ServicoNaoImplementado) resposta).setMensagem("Servico Nao Implementado!");
            }

            //Enviar o objeto com a resposta
            try {
                objectOutputStream.writeObject(resposta);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }
}
