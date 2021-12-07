package com.bees.cervejaria.interfaces;

import com.bees.cervejaria.Embalagem;
import com.bees.cervejaria.persistencia.Cerveja;

public interface IEnvase {
    Embalagem encher(Cerveja cerveja);
}
