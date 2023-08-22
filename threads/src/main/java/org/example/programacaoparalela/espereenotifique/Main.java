package org.example.programacaoparalela.espereenotifique;

import org.example.programacaoparalela.tarefas.Tarefa;

public class Main {

    public static void main(String[] args){

        Thread tarefa = new Thread(new Tarefa());
        tarefa.start();

        try {
            // AGUARDA TERMINO DA TAREFA
            tarefa.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Terminando a primeira parte");

    }
}
