package org.example.programacaoparalela.threadsafe;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

    private List<String> list = new ArrayList<>();

    public synchronized void add(int i){
        String nome = Thread.currentThread().getName();
        list.add("Thread: " + nome + ", Valor: " + i);
        //System.out.println("Thread: " + nome + ", Valor: " + i);
    }

    public void show(){
        for (String obj : list){
            System.out.println(obj);
        }
    }
}
