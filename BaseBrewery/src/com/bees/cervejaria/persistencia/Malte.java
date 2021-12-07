package com.bees.cervejaria.persistencia;

public class Malte {
    private EstadoMalte estado;
    private boolean temEnzima;
    private boolean temLevedura;

    public Malte(EstadoMalte tipo) {
        this.estado = tipo;
    }

    public void ativaEnzima() {
        this.temEnzima = true;
    }

    public void ativaLevedura() {
        this.temLevedura = true;
    }

    public EstadoMalte getEstado() {
        return estado;
    }

    public void setEstado(EstadoMalte estado) {
        this.estado = estado;
    }

    public boolean getTemEnzima() {
        return temEnzima;
    }

    public boolean getTemLevedura() {
        return temLevedura;
    }
}
