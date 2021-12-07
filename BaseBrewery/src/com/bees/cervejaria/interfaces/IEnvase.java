package com.bees.cervejaria.interfaces;

import com.bees.cervejaria.Embalagem;
import com.bees.cervejaria.persistencia.Cerveja;

import java.util.List;

public interface IEnvase {
    List<Embalagem> encher(Cerveja cerveja);
}
