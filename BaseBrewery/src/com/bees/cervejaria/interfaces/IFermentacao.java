package com.bees.cervejaria.interfaces;

import com.bees.cervejaria.persistencia.Cerveja;
import com.bees.cervejaria.persistencia.Mosto;

public interface IFermentacao {

    Cerveja fermentar(Mosto mosto);

}
