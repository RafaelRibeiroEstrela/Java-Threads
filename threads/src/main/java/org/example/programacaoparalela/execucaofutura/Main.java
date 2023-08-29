package org.example.programacaoparalela.execucaofutura;

import org.example.programacaoparalela.tarefas.Tarefa;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        /*
        Utilizamos o Runnable para executar algo em paralelo que nao precisar de retorno

        Utilizamos o Callable para executar algo em paralelo que precisa de retorno. O retorno e um future


         */

        Comando c1 = new Comando("c1");
        Comando c2 = new Comando("c2");
        Tarefa t1 = new Tarefa();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Future<String> fc1 = threadPool.submit(c1);
        Future<String> fc2 = threadPool.submit(c2);
        threadPool.execute(t1);
        String r1 = fc1.get();
        String r2 = fc2.get(10L, TimeUnit.SECONDS);
        threadPool.shutdown();
        System.out.println(r1 + " - " + r2);


    }
}
