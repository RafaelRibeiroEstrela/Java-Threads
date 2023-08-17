package org.example.programacaoparalela.threadsafe;

public class Main {

    public static void main(String[] args) {

        EstruturaDeDados estruturaDeDados = new EstruturaDeDados();

        for (int i = 0; i < 10; i++) {
            new Thread(new InserindoElementosNaEstruturaDeDados(estruturaDeDados), String.valueOf(i)).start();
        }

        new Thread(new MostrandoElementosDaEstruturaDeDados(estruturaDeDados)).start();
    }
}
