package com.bees.cervejaria.interfaces;

import com.bees.cervejaria.persistencia.Malte;
import com.bees.cervejaria.persistencia.Mosto;

public interface IFiltragem {

    Mosto filtrar(Malte malte);

}
