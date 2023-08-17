package org.example.programacaoparalela.espereenotifique.exemplo;

public class Main {

    public static void main(String[] args){
        Geladeira geladeira = new Geladeira();

        new Thread(new PegarCoisasNaGeladeira(geladeira), "Antonio").start();
        new Thread(new PegarCoisasNaGeladeira(geladeira), "Joao").start();
        Thread thread3 = new Thread(new ReabasteceGeladeira(geladeira), "Guilherme");
        thread3.setDaemon(true);
        thread3.start();
    }
}
