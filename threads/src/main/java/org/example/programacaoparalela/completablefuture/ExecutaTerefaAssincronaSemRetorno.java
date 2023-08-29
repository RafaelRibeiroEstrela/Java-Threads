package org.example.programacaoparalela.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExecutaTerefaAssincronaSemRetorno {

    public void executaTarefa() {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Executando tarefa sem retorno");
            // Simulação de tarefa longa
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Tarefa assíncrona completa sem retorno");
        });
    }


}
