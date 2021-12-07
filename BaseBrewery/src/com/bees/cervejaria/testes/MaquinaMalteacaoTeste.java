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
        Grao graoInNatura = new Grao(TipoGrao.CEVADA);
        Grao graoUmidecido = maquina.umedecer(graoInNatura);
        assert graoUmidecido.getEstado() == EstadoGrao.UMIDO;
    }

    public void deveDevolverGraoComEstadoSeco(MaquinaMalteacao maquina) {
        Grao graoUmidecido = new Grao(TipoGrao.CEVADA);
        Grao graoSeco = maquina.secar(graoUmidecido);
        assert graoSeco.getEstado() == EstadoGrao.SECO;
    }

    public void deveDevolverMalteComEstadoTorrado() {

    }

}
