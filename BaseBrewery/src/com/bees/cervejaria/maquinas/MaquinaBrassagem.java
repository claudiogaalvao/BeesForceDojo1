package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IBrassagem;
import com.bees.cervejaria.persistencia.EstadoMalte;
import com.bees.cervejaria.persistencia.Malte;

public class MaquinaBrassagem implements IBrassagem {
    @Override
    public Malte cozinhar(Malte malte) {
        if(malte.getEstado() != EstadoMalte.MOIDO)
            throw new IllegalArgumentException("Malte deveria estar moído");
        malte.setEstado(EstadoMalte.COZIDO);
        malte.ativaEnzima();
        malte.ativaLevedura();
        return malte;
    }
}
