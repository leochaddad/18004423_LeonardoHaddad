package br.maua.enums;

public enum Plataforma {
    PC("PC"),PS4("PS4");

    private String display;
    Plataforma(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
