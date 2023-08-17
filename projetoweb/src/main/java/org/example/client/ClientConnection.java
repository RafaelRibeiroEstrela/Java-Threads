package org.example.client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class ClientConnection implements Runnable {

    private Socket socket;


    @Override
    public void run() {
        openConnection();
        enviandoDados();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        closeConnection();
    }

    private void openConnection() {
        System.out.println("Abrindo conexao");
        try {
            socket = new Socket("localhost", 12345);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() {
        System.out.println("Fechando conexao");
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void enviandoDados(){
        String mensagem = Thread.currentThread().getName();
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(mensagem);
            ps.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
