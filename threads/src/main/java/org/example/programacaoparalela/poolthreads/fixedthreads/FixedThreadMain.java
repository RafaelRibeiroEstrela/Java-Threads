package org.example.programacaoparalela.poolthreads.fixedthreads;

import org.example.programacaoparalela.tarefas.Tarefa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadMain {

    public static void main(String[] args) {

        // CRIA UM POOL DE THREADS COM TAMANHO FIXO
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // NOVAS THREADS SERAO CRIADAS QUANDO UM DAS DUAS THREADS ESTAREM LIBERADAS
        threadPool.execute(new Tarefa());
        threadPool.execute(new Tarefa());
        threadPool.execute(new Tarefa());

        threadPool.shutdown();

    }
}
