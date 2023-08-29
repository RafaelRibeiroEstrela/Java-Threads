package org.example.programacaoparalela.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExecutaTerefaAssincronaComRetorno {

    public CompletableFuture<String> executaTarefa() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Executando tarefa com retorno");
            // Simulação de tarefa longa
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Tarefa assíncrona completa com retorno";
        });
    }


}
