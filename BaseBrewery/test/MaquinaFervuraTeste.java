import com.bees.cervejaria.maquinas.MaquinaBrassagem;
import com.bees.cervejaria.maquinas.MaquinaFervura;
import com.bees.cervejaria.persistencia.Mosto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaFervuraTeste {

    MaquinaFervura maquina;

    @BeforeEach
    public void inicializa() {
        maquina = new MaquinaFervura();
    }

    @Test
    public void quandoFerverReceberMostoFiltrado_DeveRetornarMostoComLupulo() {
        //given
        Mosto mosto = new Mosto();
        mosto.setFiltrado(true);

        //when
        Mosto mostoRetornado = maquina.ferver(mosto);

        //then
        Assertions.assertTrue(mostoRetornado.getLupulo());
    }

    @Test
    public void quandoFerverReceberMostoFiltrado_DeveRetornarMostoComTemperaturaAlta() {
        //given
        Mosto mosto = new Mosto();
        mosto.setFiltrado(true);

        //when
        Mosto mostoRetornado = maquina.ferver(mosto);

        //then
        Assertions.assertTrue(mostoRetornado.getTemperatura() >= 100);
    }

    @Test
    public void quandoFerverNaoReceberMostoFiltrado_DeveLancarExcecao() {
        //given
        Mosto mosto = new Mosto();
        mosto.setFiltrado(false);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.ferver(mosto);
        });
    }

}
