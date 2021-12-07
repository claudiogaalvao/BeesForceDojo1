package com.bees.cervejaria.testes;

import com.bees.cervejaria.maquinas.MaquinaMalteacao;
import com.bees.cervejaria.persistencia.EstadoGrao;
import com.bees.cervejaria.persistencia.Grao;
import com.bees.cervejaria.persistencia.TipoGrao;
import org.junit.jupiter.api.Test;

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
 @Test
    public static void deveDevolverGraoComEstadoUmido(MaquinaMalteacao maquina) {
        //given
        Grao graoInNatura = new Grao(TipoGrao.CEVADA);
        graoInNatura.setEstado(EstadoGrao.IN_NATURA);
        //when
        Grao graoUmidecido = maquina.umedecer(graoInNatura);

        //then
        assert graoUmidecido.getEstado() == EstadoGrao.UMIDO;
    }

    @Test
    public void deveDevolverGraoComEstadoSeco(MaquinaMalteacao maquina) {
        //given
        Grao graoUmidecido = new Grao(TipoGrao.CEVADA);
        graoUmidecido.setEstado(EstadoGrao.UMIDO);

        //when
        Grao graoSeco = maquina.secar(graoUmidecido);

        //then
        assert graoSeco.getEstado() == EstadoGrao.SECO;
    }

    public void deveDevolverMalteComEstadoTorrado() {

    }

}
