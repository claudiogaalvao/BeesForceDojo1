package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IResfriamento;
import com.bees.cervejaria.persistencia.Mosto;

import static com.bees.cervejaria.persistencia.Constantes.*;

public class MaquinaResfriamento implements IResfriamento {

    @Override
    public Mosto resfriar(Mosto mosto) {
        if (!mosto.getFiltrado() || (mosto.getTemperatura() < TEMPERATURA_FERVURA_MOSTO))
            throw new IllegalArgumentException("Mosto deve estar filtrado e fervido");

        for (int temp = mosto.getTemperatura(); temp > TEMPERATURA_MEDIA_RESFRIAMENTO_MOSTO; temp--) {
            int temperaturaAtual = mosto.getTemperatura();
            mosto.setTemperatura(temperaturaAtual--);
        }

        return mosto;
    }
}
