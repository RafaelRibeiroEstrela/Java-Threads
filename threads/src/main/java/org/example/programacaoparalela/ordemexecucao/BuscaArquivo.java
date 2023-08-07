package org.example.programacaoparalela.ordemexecucao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BuscaArquivo implements Runnable{

    private String palavra;
    private String diretorio;

    public BuscaArquivo(String palavra, String diretorio){
        this.palavra = palavra;
        this.diretorio = diretorio;
    }


    @Override
    public void run() {
        try {
            List<String> list = Files.readAllLines(Paths.get(diretorio));
            System.out.println("Percorrendo arquivo e buscando a palavra " + palavra);
            list.forEach(obj -> {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
