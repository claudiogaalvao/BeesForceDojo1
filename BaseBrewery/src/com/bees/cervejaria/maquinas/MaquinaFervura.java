package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IFervura;
import com.bees.cervejaria.persistencia.Mosto;

public class MaquinaFervura implements IFervura {

    private static final int TEMPERATURA_FERVURA = 100;

    @Override
    public Mosto ferver(Mosto mosto) {
        if (!mosto.getFiltrado())
            throw new IllegalArgumentException("mosto deve estar filtrado");

        mosto.setTemLupulo(true);
        mosto.setTemperatura(TEMPERATURA_FERVURA);
        return mosto;
    }

}
