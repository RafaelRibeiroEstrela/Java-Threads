package org.example.models.enums;

public enum Prioridade {

    BAIXA(1),
    MEDIA(2),
    ALTA(3);

    private int value;

    Prioridade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
