package com.bees.cervejaria.persistencia;

public class Malte {
    private TipoMalte tipo;
    private boolean temEnzima;
    private boolean temLevedura;

    public Malte(TipoMalte tipo) {
        this.tipo = tipo;
    }

    public Malte(TipoMalte tipo, boolean temEnzima, boolean temLevedura) {
        this.tipo = tipo;
        this.temEnzima = temEnzima;
        this.temLevedura = temLevedura;
    }

    public TipoMalte getTipo() {
        return tipo;
    }

    public void setTipo(TipoMalte tipo) {
        this.tipo = tipo;
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
