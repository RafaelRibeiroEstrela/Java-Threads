package org.example.programacaoparalela.espereenotifique;

public class TarefaNoBanheiro implements Runnable{

    private Banheiro banheiro;

    public TarefaNoBanheiro(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.noBanheiro();
    }
}
