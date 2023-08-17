package org.example.programacaoparalela.espereenotifique.exemplo;

public class ReabasteceGeladeira implements Runnable {

    private Geladeira geladeira;

    public ReabasteceGeladeira(Geladeira geladeira){
        this.geladeira = geladeira;
    }

    @Override
    public void run() {
        while (true){
            geladeira.abastecerGeladeira();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
