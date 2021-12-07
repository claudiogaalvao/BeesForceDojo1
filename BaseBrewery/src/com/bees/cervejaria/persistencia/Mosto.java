package com.bees.cervejaria.persistencia;

public class Mosto {

    private boolean filtrado = false;
    private boolean temLupulo = false;
    private int temperatura = 0;

    public int getDiasFermentacao() {
        return diasFermentacao;
    }

    public void setDiasFermentacao(int diasFermentacao) {
        this.diasFermentacao = diasFermentacao;
    }

    private int diasFermentacao = 0;

    public boolean getFiltrado() {
        return filtrado;
    }

    public void setFiltrado(boolean filtrado) {
        this.filtrado = filtrado;
    }

    public boolean getLupulo() {
        return temLupulo;
    }

    public void setTemLupulo(boolean temLupulo) {
        this.temLupulo = temLupulo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
