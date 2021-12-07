package com.bees.cervejaria.interfaces;

import com.bees.cervejaria.persistencia.Grao;

public interface IMalteacao {

    void umedecer(Grao grao);

    void secar(Grao grao);

    void torrar(Grao grao);

}
