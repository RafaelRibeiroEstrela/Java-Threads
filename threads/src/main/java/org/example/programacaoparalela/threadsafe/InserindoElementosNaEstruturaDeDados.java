package org.example.programacaoparalela.threadsafe;

public class InserindoElementosNaEstruturaDeDados implements Runnable{

    private EstruturaDeDados estruturaDeDados;

    public InserindoElementosNaEstruturaDeDados(EstruturaDeDados estruturaDeDados){
        this.estruturaDeDados = estruturaDeDados;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            estruturaDeDados.add(i);
        }

    }
}
