package org.example.programacaoparalela.objetoconcorrente;

import java.util.concurrent.atomic.AtomicBoolean;

public class Atividade implements Runnable {

    /*
    Quando um objeto e usado por mais de uma thread e um atributo e utilizado por ambos, devemos alterar o tipo do atributo
    para que o estado do atributo seja refletido em todas as threads.

    Para o boolean podemos simplesmente adicionar a palavra volatile ou utilizar o tipo especial AtomicBoolean

    Ao alterar o valor do atributo, todas as threads irao enxegar esse novo valor.

     */
    //private boolean estaFazendo;
    //private volatile boolean estaFazendo;
    private AtomicBoolean estaFazendo;
    public void fazendoAtividade(){
        System.out.println("Iniciando Atividade");
        estaFazendo = new AtomicBoolean(true);
        while (estaFazendo.get()) {

        }

        System.out.println("Pausa da Atividade");

        while (!estaFazendo.get()) {

        }

        System.out.println("Finalizando Atividade");

    }

    public void setEstaFazendo(boolean estaFazendo) {
        this.estaFazendo = new AtomicBoolean(estaFazendo);
    }

    @Override
    public void run() {
        fazendoAtividade();
    }
}
