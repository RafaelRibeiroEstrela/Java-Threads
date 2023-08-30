package org.example;


import org.example.models.Consulta;
import org.example.models.Medico;
import org.example.models.Paciente;
import org.example.models.enums.Especialidade;
import org.example.models.enums.Prioridade;
import org.example.services.AgendamentoService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        Medico m1 = new Medico("Carlos", Especialidade.OTORRINO);

        Paciente p1 = new Paciente("Jorge");

        AgendamentoService agendamentoService = new AgendamentoService();

        for (int i=0; i<300; i++) {
            CompletableFuture.runAsync(() -> {
                agendamentoService.adicionarConsulta(new Consulta(m1, p1, LocalDateTime.now(),Prioridade.BAIXA));
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        while (agendamentoService.verificaSeAtivado()) {

        }

    }

}