package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.interfaces.IFermentacao;
import com.bees.cervejaria.persistencia.Cerveja;
import com.bees.cervejaria.persistencia.Mosto;

public class MaquinaFermentacao implements IFermentacao {
    @Override
    public Cerveja fermentar(Mosto mosto) {
        return null;
    }
}
