package org.example;

public class CriandoThread {
    public static void main(String[] args) throws InterruptedException {

        Processo processo1 = new Processo();
        Processo processo2 = new Processo();

        Thread thread1 = new Thread(processo1);
        Thread thread2 = new Thread(processo2);
        thread1.start();
        thread2.start();


    }
}
