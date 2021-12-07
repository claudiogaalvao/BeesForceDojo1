package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IMalteacao;
import com.bees.cervejaria.persistencia.EstadoGrao;
import com.bees.cervejaria.persistencia.Grao;
import com.bees.cervejaria.persistencia.Malte;
import com.bees.cervejaria.persistencia.EstadoMalte;

public class MaquinaMalteacao implements IMalteacao {

    @Override
    public Grao umedecer(Grao grao) {
        if (grao.getEstado() != EstadoGrao.IN_NATURA)
            throw new IllegalArgumentException("Grão deveria estar em IN_NATURA");

        grao.setEstado(EstadoGrao.UMIDO);
        return grao;
    }

    @Override
    public Grao secar(Grao grao) {
        if (grao.getEstado() != EstadoGrao.UMIDO)
            throw new IllegalArgumentException("Grão deveria estar em UMIDO");

        grao.setEstado(EstadoGrao.SECO);
        return grao;
    }

    @Override
    public Malte torrar(Grao grao) {
        if (grao.getEstado() != EstadoGrao.SECO)
            throw new IllegalArgumentException("Grão deveria estar em SECO");

        Malte malte = new Malte(EstadoMalte.TORRADO);
        return malte;
    }

}
