package org.example.programacaoparalela.objetoconcorrente;

public class Main {

    public static void main(String[] args) {

        Atividade atividade = new Atividade();

        new Thread(atividade).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        atividade.setEstaFazendo(false);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        atividade.setEstaFazendo(true);


    }
}
