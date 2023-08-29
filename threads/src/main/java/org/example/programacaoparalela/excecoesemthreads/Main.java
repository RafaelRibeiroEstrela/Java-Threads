package org.example.programacaoparalela.excecoesemthreads;

import org.example.programacaoparalela.tarefas.Tarefa;

public class Main {

    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa();

        Thread thread = new Thread(tarefa);

        thread.setUncaughtExceptionHandler(new TratadorDeException());

        thread.start();

        System.out.println("Terminou");
    }
}
