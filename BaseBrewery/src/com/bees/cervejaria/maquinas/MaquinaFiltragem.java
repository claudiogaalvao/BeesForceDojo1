package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IFiltragem;
import com.bees.cervejaria.persistencia.EstadoMalte;
import com.bees.cervejaria.persistencia.Malte;
import com.bees.cervejaria.persistencia.Mosto;

public class MaquinaFiltragem implements IFiltragem {

    @Override
    public Mosto filtrar(Malte malte) {
        if (malte.getEstado() != EstadoMalte.COZIDO)
            throw new IllegalArgumentException("Malte deveria estar cozido");

        return separarMosto(malte);
    }

    private Mosto separarMosto(Malte malte){
        Mosto mosto = new Mosto();
        mosto.setFiltrado(true);
        return mosto;
    }
}
