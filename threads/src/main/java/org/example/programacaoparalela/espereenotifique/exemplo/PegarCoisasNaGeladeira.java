package org.example.programacaoparalela.espereenotifique.exemplo;

public class PegarCoisasNaGeladeira implements Runnable{

    private Geladeira geladeira;

    public PegarCoisasNaGeladeira(Geladeira geladeira){
        this.geladeira = geladeira;
    }


    @Override
    public void run() {
        geladeira.pegarCoisas();
    }
}
