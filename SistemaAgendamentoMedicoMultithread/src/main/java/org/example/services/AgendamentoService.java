package org.example.services;

import org.example.models.Consulta;
import org.example.models.comparators.ConsultaComparator;

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
                consultas.add(obeterIndiceValido(i), consulta);
                return;
            } else if (consulta.getPrioridade().getValue() == consultas.get(i).getPrioridade().getValue()) {
                if (consulta.getDataHora().isBefore(consulta.getDataHora())) {
                    consultas.add(obeterIndiceValido(i), consulta);
                    return;
                }
            }
        }
        consultas.add(consulta);
    }

    private int obeterIndiceValido(int i) {
        if (i - 1 < 0) {
            return 0;
        }
        return i - 1;
    }
}
