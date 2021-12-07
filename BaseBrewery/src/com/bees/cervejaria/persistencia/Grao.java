package com.bees.cervejaria.persistencia;

public class Grao  {
    private TipoGrao tipo;
    private EstadoGrao estado;

    public Grao(TipoGrao tipo) {
        this.tipo = tipo;
    }

    public TipoGrao getTipo() {
        return tipo;
    }

    public void setTipo(TipoGrao tipo) {
        this.tipo = tipo;
    }

}
