package org.example.models;

import org.example.models.enums.Prioridade;

import java.time.LocalDateTime;

public class Consulta {

    private Medico medico;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private Prioridade prioridade;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime dataHora, Prioridade prioridade) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.prioridade = prioridade;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "medico=" + medico +
                ", paciente=" + paciente +
                ", dataHora=" + dataHora +
                ", prioridade=" + prioridade +
                '}';
    }
}
