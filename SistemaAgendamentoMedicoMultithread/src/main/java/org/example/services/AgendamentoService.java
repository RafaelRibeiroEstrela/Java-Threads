package org.example.services;

import org.example.models.Consulta;

import java.util.LinkedList;
import java.util.List;

public class AgendamentoService {

    private List<Consulta> consultas = new LinkedList<>();

    public void adicionarConsulta(Consulta consulta) {

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

    public void mostrarConsultas() {
        for (Consulta obj : consultas) {
            System.out.println(obj);
        }
    }
}
