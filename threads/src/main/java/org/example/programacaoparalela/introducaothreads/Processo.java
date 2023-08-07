package org.example.programacaoparalela.introducaothreads;

public class Processo implements Runnable{


    @Override
    public void run() {

        System.out.println("INICIO: MULTIPLCANDO VALORES EM UM LAÇO DE ATE 999999999");

        for (long i=0; i<999999L; i++){
            long x = 898231L;
            long y = 898231L;
            Math.pow(x,y);
        }

        System.out.println("FIM: MULTIPLCANDO VALORES EM UM LAÇO DE ATE 999999999");
    }
}
