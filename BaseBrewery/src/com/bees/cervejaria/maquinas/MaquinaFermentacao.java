package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IFermentacao;
import com.bees.cervejaria.persistencia.Cerveja;
import com.bees.cervejaria.persistencia.Constantes;
import com.bees.cervejaria.persistencia.Mosto;

public class MaquinaFermentacao implements IFermentacao {
    @Override
    public Cerveja fermentar(Mosto mosto) {
        if ( !(mosto.getTemperatura() >= Constantes.TEMPERATURA_MINIMA_RESFRIAMENTO_MOSTO
                && mosto.getTemperatura() <= Constantes.TEMPERATURA_MAXIMA_RESFRIAMENTO_MOSTO) )
            throw new IllegalArgumentException("Mosto deve na faixa de temperatura correta");

        for (int dias = mosto.getDiasFermentacao(); mosto.getDiasFermentacao() < Constantes.DIAS_FERMENTACAO; dias++) {
            mosto.setDiasFermentacao(dias);
        }

        return pegaCerveja(mosto);
    }

    private Cerveja pegaCerveja(Mosto mosto){
        if (!(mosto.getDiasFermentacao() >= Constantes.DIAS_FERMENTACAO))
            throw new IllegalArgumentException("Mosto precisa ficar em fermentação pelo menos por 7 dias");
        return new Cerveja(Constantes.VOLUME_TANQUE_FERMENTACAO_LITROS);
    }
}
