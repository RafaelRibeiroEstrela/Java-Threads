package org.example.programacaoparalela.ordemexecucao;

public class Main {

    public static void main(String[] args){

        // NAO EXISTE UMA ORDEM DE EXECUCAO QUANDO ALGO E EXECUTADO EM PARALELO

        String diretorio = "script-relacional-insert.sql";
        Thread thread1 = new Thread(new BuscaArquivo("Cuiabá", diretorio));
        Thread thread2 = new Thread(new BuscaArquivo("Ivoti", diretorio));
        Thread thread3 = new Thread(new BuscaArquivo("Campo Grande", diretorio));
        Thread thread4 = new Thread(new BuscaArquivo("São Paulo", diretorio));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
