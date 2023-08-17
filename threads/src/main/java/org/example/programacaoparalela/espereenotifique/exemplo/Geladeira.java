package org.example.programacaoparalela.espereenotifique.exemplo;

public class Geladeira {

    private boolean geladeiraVazia = true;

    public void pegarCoisas(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " está vendo se a geladeira esta ocupada");
        pegandoCoisas(nome);

    }

    private synchronized void pegandoCoisas(String nome){
        System.out.println(nome + " abre a geladeira");
        while (geladeiraVazia){
            esperaAbastecerGeladeira(nome);
        }
        System.out.println(nome + " esta pegando coisas para comer");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        geladeiraVazia = true;
        System.out.println(nome + " fecha a geladeira");
    }

    public void abastecerGeladeira(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " está vendo se a geladeira esta ocupada");
        if (geladeiraVazia){
            synchronized (this){
                System.out.println(nome + " abre a geladeira");
                System.out.println(nome + " reabastece geladeira");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                geladeiraVazia = false;
                System.out.println(nome + " fecha a geladeira");
                System.out.println(nome + " avisa a todos");
                this.notifyAll();
            }
        }
    }

    private void esperaAbastecerGeladeira(String nome){
        System.out.println("A geladeira esta vazia");
        System.out.println(nome + " espera abastecer a geladeira");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
