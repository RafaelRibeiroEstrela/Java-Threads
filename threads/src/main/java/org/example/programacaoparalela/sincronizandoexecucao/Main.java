package org.example.programacaoparalela.sincronizandoexecucao;

public class Main {

    public static void main(String[] args){

        Banheiro banheiro = new Banheiro();

        Thread thread1 = new Thread(new CaminhoParaBanheiro(banheiro), "Carlos");
        Thread thread2 = new Thread(new CaminhoParaBanheiro(banheiro), "Antonio");

        thread1.start();
        thread2.start();
    }
}
