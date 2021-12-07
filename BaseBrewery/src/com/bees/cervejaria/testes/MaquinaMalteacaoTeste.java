package com.bees.cervejaria.testes;

import com.bees.cervejaria.maquinas.MaquinaMalteacao;
import com.bees.cervejaria.persistencia.EstadoGrao;
import com.bees.cervejaria.persistencia.Grao;
import com.bees.cervejaria.persistencia.TipoGrao;

public class MaquinaMalteacaoTeste {

    public static void main(String[] args) {
        try {
            MaquinaMalteacao maquina = new MaquinaMalteacao();

            deveDevolverGraoComEstadoUmido(maquina);

            System.out.println("MaquinaMalteacaoTeste - SUCESSO");
        } catch (Exception e) {
            System.out.println("MaquinaMalteacaoTeste - ERRO " + e.getMessage());
        }
    }

    public static void deveDevolverGraoComEstadoUmido(MaquinaMalteacao maquina) {
        // given
        Grao graoInNatura = new Grao(TipoGrao.CEVADA);

        // when
        Grao graoUmido = maquina.umedecer(graoInNatura);

        // then
        assert graoUmido.getEstado() == EstadoGrao.UMIDO;
    }

    public void deveDevolverGraoComEstadoSeco() {

    }

    public void deveDevolverMalteComEstadoTorrado() {

    }

}
