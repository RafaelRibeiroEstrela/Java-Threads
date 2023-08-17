package org.example.programacaoparalela.espereenotifique;

public class Main {

    public static void main(String[] args){

        Banheiro banheiro = new Banheiro();

        Thread thread1 = new Thread(new TarefaNoBanheiro(banheiro), "Carlos");
        Thread thread2 = new Thread(new TarefaNoBanheiro(banheiro), "Antonio");
        Thread thread3 = new Thread(new Limpeza(banheiro), "Faxineiro");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
