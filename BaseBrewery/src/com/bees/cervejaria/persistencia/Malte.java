package com.bees.cervejaria.persistencia;

public class Malte {
    private EstadoMalte estado;
    private boolean temEnzima;
    private boolean temLevedura;

    public Malte(EstadoMalte tipo) {
        this.estado = tipo;
    }

    public Malte(EstadoMalte estado, boolean temEnzima, boolean temLevedura) {
        this.estado = estado;
        this.temEnzima = temEnzima;
        this.temLevedura = temLevedura;
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

    public void setTemEnzima(boolean temEnzima) {
        this.temEnzima = temEnzima;
    }

    public boolean getTemLevedura() {
        return temLevedura;
    }

    public void setTemLevedura(boolean temLevedura) {
        this.temLevedura = temLevedura;
    }
}
