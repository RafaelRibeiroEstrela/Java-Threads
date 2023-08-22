package org.example.programacaoparalela.tarefas;

public class Tarefa implements Runnable {

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        System.out.println("Iniciando " + nome);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finalizando " + nome);
    }
}
