package org.example.services;

import org.example.models.Consulta;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class AgendamentoService {

    private List<Consulta> consultas = new Vector<>();
    private AtomicBoolean ativado;

    public AgendamentoService() {
        ativado = new AtomicBoolean(true);
        executaConsulta();
    }

    public void adicionarConsulta(Consulta consulta) {
        System.out.println("Adicionando consulta");
        if (consultas.isEmpty()) {
            consultas.add(consulta);
            return;
        }
        for (int i = 0; i < consultas.size(); i++) {
            if (consulta.getPrioridade().getValue() > consultas.get(i).getPrioridade().getValue()) {
                consultas.add(i, consulta);
                return;
            }
        }
        consultas.add(consulta);
    }

    private void executaConsulta() {
        System.out.println("Executando consultas");
        CompletableFuture.runAsync(() -> {
            while (ativado.get()) {
                if (consultas.isEmpty()) {
                    continue;
                }
                Consulta consulta = consultas.get(0);
                System.out.println("Consulta em execução com o medico " + consulta.getMedico().getNome() + " e paciente " + consulta.getPaciente().getNome() + " hora: " + consulta.getDataHora());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                removerConsulta();
            }
            System.out.println("Saindo do laco while");
        });
    }

    private void removerConsulta() {
        System.out.println("Removendo consulta");
        consultas.remove(0);
        if (consultas.isEmpty()) {
            System.out.println("Lista de consultas vazia");
            ativado = new AtomicBoolean(false);
        }
    }

    public boolean verificaSeAtivado() {
        return ativado.get();
    }


}
