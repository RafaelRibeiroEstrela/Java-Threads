package org.example.programacaoparalela.espereenotifique;

public class Banheiro {

    private boolean sujo = true;

    public void usaVaso(String nome){
        System.out.println(nome + " esta usando vaso");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void usaPia(String nome){
        System.out.println(nome + " esta usando a pia");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void entraNoBanheior(String nome){
        System.out.println(nome + " Entra no banheiro");
        usaVaso(nome);
        usaPia(nome);
        System.out.println(nome + " Lava as maos");
        System.out.println(nome + " Sai do banheiro");
    }

    public void noBanheiro() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Verifica se alguem esta no banheiro");
        while (sujo) {
            esperaLaFora(nome);
        }
        noBanheiro();
    }

    public void limpa() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Verifica se alguem esta no banheiro");
        if (!sujo) {
            System.out.println("Nao esta sujo");
            return;
        }
        synchronized (this) {
            System.out.println(nome + " Entra no banheiro");
            System.out.println("Limpando banheiro");
            limpandoBanheiro();
            System.out.println(nome + " Sai do banheiro");
            System.out.println("Avisando a todos");
            this.notifyAll();
        }
    }

    private void limpandoBanheiro(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void esperaLaFora(String nome) {
        System.out.println(nome + ", eca, banheiro esta sujo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
