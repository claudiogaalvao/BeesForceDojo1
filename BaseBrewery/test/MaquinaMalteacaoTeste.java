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
        maquina = new MaquinaMalteacao();
    }

    @Test
    public void testarUmidecerGraoInNatura() {
        //given
        Grao graoInNatura = new Grao(TipoGrao.CEVADA);
        graoInNatura.setEstado(EstadoGrao.IN_NATURA);
        //when
        Grao graoUmidecido = maquina.umedecer(graoInNatura);

        //then
        Assertions.assertEquals(EstadoGrao.UMIDO, graoUmidecido.getEstado());
    }

    @Test
    public void testarUmidecerGraoNaoInNatura() {
        //given
        Grao graoInNatura = new Grao(TipoGrao.CEVADA);
        graoInNatura.setEstado(EstadoGrao.SECO);

        //when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.umedecer(graoInNatura);
        });
    }

    @Test
    public void testarSecarGraoUmido() {
        //given
        Grao graoUmidecido = new Grao(TipoGrao.CEVADA);
        graoUmidecido.setEstado(EstadoGrao.UMIDO);

        //when
        Grao graoSeco = maquina.secar(graoUmidecido);

        //then
        Assertions.assertEquals(EstadoGrao.SECO, graoSeco.getEstado());
    }

    @Test
    public void testarSecarGraoNaoUmido() {
        //given
        Grao grao = new Grao(TipoGrao.CEVADA);
        grao.setEstado(EstadoGrao.IN_NATURA);

        //when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.secar(grao);
        });
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

    @Test
    public void deveDevolverMalteComEstadoNaoTorrado() {
        //given
        Grao grao = new Grao(TipoGrao.CEVADA);
        grao.setEstado(EstadoGrao.TORRADO);

        //when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.torrar(grao);
        });
    }

}
