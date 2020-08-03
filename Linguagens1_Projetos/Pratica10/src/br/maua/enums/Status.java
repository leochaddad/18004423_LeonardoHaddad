package br.maua.enums;

public enum Status {
    PLATINADO("Platinado"), NAO_INICIADO("Não iniciado"),TERMINADO("Terminado"), JOGANDO("Jogando");

    private String display;

    Status(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
