package com.bees.cervejaria.persistencia;

public class Malte {
    public Malte(TipoMalte tipo) {
        this.tipo = tipo;
    }

    public Malte(TipoMalte tipo, Boolean temEnzima, Boolean temLevedura) {
        this.tipo = tipo;
        this.temEnzima = temEnzima;
        this.temLevedura = temLevedura;
    }

    private TipoMalte tipo;
    private Boolean temEnzima;
    private Boolean temLevedura;

    public TipoMalte getTipo() {
        return tipo;
    }

    public void setTipo(TipoMalte tipo) {
        this.tipo = tipo;
    }

    public Boolean getTemEnzima() {
        return temEnzima;
    }

    public void setTemEnzima(Boolean temEnzima) {
        this.temEnzima = temEnzima;
    }

    public Boolean getTemLevedura() {
        return temLevedura;
    }

    public void setTemLevedura(Boolean temLevedura) {
        this.temLevedura = temLevedura;
    }
}
