package org.example.client;

public class ClienteTarefas {

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 5; i++) {
            new Thread(new ClientConnection()).start();
        }

    }

}
