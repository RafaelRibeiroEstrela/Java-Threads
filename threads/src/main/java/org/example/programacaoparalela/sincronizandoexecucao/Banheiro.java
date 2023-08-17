package org.example.programacaoparalela.sincronizandoexecucao;

public class Banheiro {

    public void noBanheiro(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Verifica se alguem esta no banheiro");

        synchronized (this) {
            System.out.println(nome + " Entra no banheiro");
            System.out.println(nome + " Faz a necessidade");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nome + " Lava as maos");
            System.out.println(nome + " Sai do banheiro");
        }
    }
}
