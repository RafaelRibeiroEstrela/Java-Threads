package org.example;


import org.example.models.Consulta;
import org.example.models.Medico;
import org.example.models.Paciente;
import org.example.models.enums.Especialidade;
import org.example.models.enums.Prioridade;
import org.example.services.AgendamentoService;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Medico m1 = new Medico("Carlos", Especialidade.OTORRINO);
        Medico m2 = new Medico("Antonio", Especialidade.CARDIOLOGISTA);
        Medico m3 = new Medico("Jessica", Especialidade.GERAL);

        Paciente p1 = new Paciente("Jorge");
        Paciente p2 = new Paciente("Maria");
        Paciente p3 = new Paciente("Moreno");
        Paciente p4 = new Paciente("Paulo");
        Paciente p5 = new Paciente("Angela");
        Paciente p6 = new Paciente("Marcos");

        Consulta c1 = new Consulta(m1, p1, LocalDateTime.of(1990,10,10,10,10,10), Prioridade.BAIXA);
        Consulta c2 = new Consulta(m2, p2, LocalDateTime.of(1990,10,10,10,10,11), Prioridade.MEDIA);
        Consulta c3 = new Consulta(m3, p3, LocalDateTime.of(1990,10,10,10,10,12), Prioridade.ALTA);
        Consulta c4 = new Consulta(m3, p4, LocalDateTime.of(1990,10,10,10,10,13), Prioridade.BAIXA);
        Consulta c5 = new Consulta(m1, p5, LocalDateTime.of(1990,10,10,10,10,14), Prioridade.ALTA);
        Consulta c6 = new Consulta(m2, p6, LocalDateTime.of(1990,10,10,10,10,15), Prioridade.MEDIA);


        AgendamentoService agendamentoService = new AgendamentoService();
        agendamentoService.adicionarConsulta(c1);
        agendamentoService.adicionarConsulta(c2);
        agendamentoService.adicionarConsulta(c3);
        agendamentoService.adicionarConsulta(c4);
        agendamentoService.adicionarConsulta(c5);
        agendamentoService.adicionarConsulta(c6);

        agendamentoService.mostrarConsultas();

    }
}