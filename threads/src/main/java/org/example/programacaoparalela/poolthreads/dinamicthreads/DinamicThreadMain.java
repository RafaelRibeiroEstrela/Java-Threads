package org.example.programacaoparalela.poolthreads.dinamicthreads;

import org.example.programacaoparalela.tarefas.Tarefa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DinamicThreadMain {

    public static void main(String[] args) {

        // CRIA UM POOL DE THREADS DE FORMA DINAMICA
        ExecutorService threadPool = Executors.newCachedThreadPool();

        threadPool.execute(new Tarefa());
        threadPool.execute(new Tarefa());
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fazendo outra coisa");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread threadTarefa = new Thread(new Tarefa());
        threadTarefa.start();

        try {
            // A THREAD ATUAL AGUARDA O TERMINO DA THREAD
            threadTarefa.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Encerrando");

        threadPool.shutdown();

    }
}
