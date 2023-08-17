package org.example.programacaoparalela.sincronizandoexecucao;

public class CaminhoParaBanheiro implements Runnable{

    private Banheiro banheiro;

    public CaminhoParaBanheiro(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.noBanheiro();
    }
}
