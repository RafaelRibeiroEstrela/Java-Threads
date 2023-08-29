package org.example.programacaoparalela.excecoesemthreads;

public class TratadorDeException implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Erro " + e.getMessage() + " na thread " + t.getName());
    }
}
