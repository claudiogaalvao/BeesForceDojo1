package com.bees.cervejaria.testes;

import com.bees.cervejaria.maquinas.MaquinaMalteacao;
import com.bees.cervejaria.persistencia.EstadoGrao;
import com.bees.cervejaria.persistencia.Grao;
import com.bees.cervejaria.persistencia.Malte;
import com.bees.cervejaria.persistencia.TipoGrao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaMalteacaoTeste {

    MaquinaMalteacao maquina;

    @BeforeEach
    public void inicializa() {

    }

//    public static void main(String[] args) {
//        try {
//            MaquinaMalteacao maquina = new MaquinaMalteacao();
//
//            deveDevolverGraoComEstadoUmido(maquina);
//
//            System.out.println("MaquinaMalteacaoTeste - SUCESSO");
//        } catch (Exception e) {
//            System.out.println("MaquinaMalteacaoTeste - ERRO " + e.getMessage());
//        }
//    }

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

    @Test
    public void deveDevolverMalteComEstadoTorrado() {
        //given
        Grao graoSeco = new Grao(TipoGrao.CEVADA);
        graoSeco.setEstado(EstadoGrao.SECO);

        //when
        Malte malte = maquina.torrar(graoSeco);

        //assert
        Assertions.assertNotNull(malte);
    }

}
