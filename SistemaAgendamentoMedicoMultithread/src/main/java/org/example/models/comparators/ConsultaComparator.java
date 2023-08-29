package org.example.models.comparators;

import org.example.models.Consulta;

import java.util.Comparator;

public class ConsultaComparator implements Comparator<Consulta> {

    @Override
    public int compare(Consulta o1, Consulta o2) {
        if (o1.getPrioridade().getValue() < o2.getPrioridade().getValue()) {
            return -1;
        } else if (o1.getPrioridade().getValue() > o2.getPrioridade().getValue()){
            return 1;
        } else if (o1.getPrioridade().getValue() == o2.getPrioridade().getValue() && o1.getDataHora().isAfter(o2.getDataHora())) {
            return -1;
        } else if (o1.getPrioridade().getValue() == o2.getPrioridade().getValue() && o1.getDataHora().isBefore(o2.getDataHora())) {
            return 1;
        }
        return 0;
    }
}
