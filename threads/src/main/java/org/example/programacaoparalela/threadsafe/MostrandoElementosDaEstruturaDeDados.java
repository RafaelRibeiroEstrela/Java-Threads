package org.example.programacaoparalela.threadsafe;

public class MostrandoElementosDaEstruturaDeDados implements Runnable{

    private EstruturaDeDados estruturaDeDados;

    public MostrandoElementosDaEstruturaDeDados(EstruturaDeDados estruturaDeDados){
       this.estruturaDeDados = estruturaDeDados;
    }

    @Override
    public void run() {
        estruturaDeDados.show();
    }
}
