package org.example.server;

import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {

    private Socket socket;

    public DistribuirTarefas(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            System.out.println("Distribuindo as tarefas para o cliente " + socket);
            Scanner sc = new Scanner(socket.getInputStream());
            while (sc.hasNext()){
                String nome = sc.nextLine();
                System.out.println(nome);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
