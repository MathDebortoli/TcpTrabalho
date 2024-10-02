/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosd;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author matheus
 */
public class ControladorServidor {

    private static final int PORTA_SERVICO = 2000;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        //Criar o ponto de transporte para conexao
        try {
            serverSocket = new ServerSocket(PORTA_SERVICO);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        while (true) {
            //Aguardar a Conexao.
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }

            Thread servidor;
            servidor = new TcpServidor(socket);
            servidor.start();
        }
    }
}
