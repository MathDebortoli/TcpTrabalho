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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author matheus
 */
public class TcpServidor extends Thread {

    private static final int DATA = 1;
    private static final int HORA = 2;
    private static final int PORTA_SERVICO = 2000;
    Date data;
    Calendar calendario;
    ServerSocket serverSocket = null;
    Socket socket = null;

    SolicitarServico solicitacao;
    Object resposta;

    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;
    //Cria-se o calendario

    public TcpServidor(Socket socket) {
        this.socket = socket;
        calendario = new GregorianCalendar();
    }

    @Override
    public void run() {

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

        ArrayList listaSintomas = solicitacao.getListaSintomas();
        Discriminador gripe = new Discriminador();
        gripe.setEntrada(listaSintomas);
        
        gripe.preencherRam();
        
        gripe.imprimirRams();

        //Identificar e providendicar o serviço solicitado.
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
