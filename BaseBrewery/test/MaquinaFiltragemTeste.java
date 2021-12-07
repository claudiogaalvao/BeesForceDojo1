import com.bees.cervejaria.maquinas.MaquinaFiltragem;
import com.bees.cervejaria.persistencia.EstadoMalte;
import com.bees.cervejaria.persistencia.Malte;
import com.bees.cervejaria.persistencia.Mosto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaFiltragemTeste {

    MaquinaFiltragem maquina;

    @BeforeEach
    public void inicializa() {
        maquina = new MaquinaFiltragem();
    }

    @Test
    public void quandoFiltrarReceberMalteCozido_DeveRetornarMosto() {
        //given
        Malte malte = new Malte(EstadoMalte.COZIDO);
        //when
        Mosto mostoFiltrado = maquina.filtrar(malte);
        //then
        Assertions.assertNotNull(mostoFiltrado);
    }

    @Test
    public void quandoFiltrarNaoReceberMalteCozido_DeveLancarExcecao() {
        //given
        Malte malte = new Malte(EstadoMalte.MOIDO);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.filtrar(malte);
        });
    }

    @Test
    public void quandoFiltrarReceberMalteCozido_DeveRetornarMostoComEstadoFiltrado() {
        //given
        Malte malte = new Malte(EstadoMalte.COZIDO);
        //when
        Mosto mostoFiltrado = maquina.filtrar(malte);
        //then
        Assertions.assertTrue(mostoFiltrado.getFiltrado());
    }

}
