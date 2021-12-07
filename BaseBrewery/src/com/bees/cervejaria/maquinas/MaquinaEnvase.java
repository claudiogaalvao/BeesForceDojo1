package com.bees.cervejaria.maquinas;

import com.bees.cervejaria.Embalagem;
import com.bees.cervejaria.interfaces.IEnvase;
import com.bees.cervejaria.persistencia.Cerveja;
import com.bees.cervejaria.persistencia.Constantes;

import java.util.List;

public class MaquinaEnvase implements IEnvase {

    @Override
    public List<Embalagem> encher(Cerveja cerveja) {
        int quantidadeCerveja = cerveja.getQuantidadeLitros();
        return null;
    }
}
