package org.example.programacaoparalela.execucaofutura;

import java.util.concurrent.Callable;

public class Comando implements Callable<String> {

    private String comando;

    public Comando(String comando) {
        this.comando = comando;
    }


    @Override
    public String call() {
        System.out.println("Execuntando comando " + comando);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finalizando comando " + comando);
        return comando;
    }
}
