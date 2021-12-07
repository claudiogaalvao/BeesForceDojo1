package com.bees.cervejaria.interfaces;

import com.bees.cervejaria.persistencia.Grao;
import com.bees.cervejaria.persistencia.Malte;

public interface IMalteacao {

    Grao umedecer(Grao grao);

    Grao secar(Grao grao);

    Malte torrar(Grao grao);

}
