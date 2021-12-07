package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IMalteacao;
import com.bees.cervejaria.persistencia.Grao;
import com.bees.cervejaria.persistencia.Malte;

public class MaquinaMalteacao implements IMalteacao {

    @Override
    public Grao umedecer(Grao grao) {
        return null;
    }

    @Override
    public Grao secar(Grao grao) {
        return null;
    }

    @Override
    public Malte torrar(Grao grao) {
        return null;
    }

}
