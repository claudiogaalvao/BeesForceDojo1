package com.bees.cervejaria.persistencia;

public class Mosto {

    private boolean filtrado = false;
    private boolean refiltrado = false;
    private boolean temLupulo = false;

    public boolean isFiltrado() {
        return filtrado;
    }

    public void setFiltrado(boolean filtrado) {
        this.filtrado = filtrado;
    }

    public boolean isRefiltrado() {
        return refiltrado;
    }

    public void setRefiltrado(boolean refiltrado) {
        this.refiltrado = refiltrado;
    }

    public boolean isTemLupulo() {
        return temLupulo;
    }

    public void setTemLupulo(boolean temLupulo) {
        this.temLupulo = temLupulo;
    }
}
