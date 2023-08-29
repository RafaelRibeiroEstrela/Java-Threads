package org.example.programacaoparalela.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        ExecutaTerefaAssincronaSemRetorno t1 = new ExecutaTerefaAssincronaSemRetorno();
        ExecutaTerefaAssincronaComRetorno t2 = new ExecutaTerefaAssincronaComRetorno();

        t1.executaTarefa();
        CompletableFuture<String> cf = t2.executaTarefa();
        String r = cf.join();

        System.out.println("Main: " + r);

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(18000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 5;
        }).exceptionally(ex -> 0);

        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (r1, r2) -> r1 + r2);
        System.out.println(combinedFuture.join());


    }
}
