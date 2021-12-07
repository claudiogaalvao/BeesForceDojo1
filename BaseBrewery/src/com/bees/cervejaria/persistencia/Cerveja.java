package com.bees.cervejaria.persistencia;

public class Cerveja {
    private int quantidadeLitros = 0;

    public Cerveja(int quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public int getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public void setQuantidadeLitros(int quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }
}
