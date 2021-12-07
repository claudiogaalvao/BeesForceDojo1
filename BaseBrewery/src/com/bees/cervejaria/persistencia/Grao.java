package com.bees.cervejaria.persistencia;

public class Grao  {
    public Grao(TipoGrao tipo) {
        this.tipo = tipo;
    }

    private TipoGrao tipo;

    public TipoGrao getTipo() {
        return tipo;
    }

    public void setTipo(TipoGrao tipo) {
        this.tipo = tipo;
    }

}
