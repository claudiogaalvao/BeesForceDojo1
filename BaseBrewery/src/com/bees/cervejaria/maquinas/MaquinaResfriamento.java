package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IResfriamento;
import com.bees.cervejaria.persistencia.Mosto;

import static com.bees.cervejaria.persistencia.Constantes.TEMPERATURA_FERVURA_MOSTO;

public class MaquinaResfriamento implements IResfriamento {

    @Override
    public Mosto resfriar(Mosto mosto) {
        if (!(mosto.getFiltrado() && mosto.getTemperatura() > 0))
            throw new IllegalArgumentException("Mosto deve estar filtrado e fervido");

        for (int temp = TEMPERATURA_FERVURA_MOSTO; temp > 0; temp--) {
            int temperaturaAtual = mosto.getTemperatura();
            mosto.setTemperatura(temperaturaAtual--);
        }

        return mosto;
    }
}
