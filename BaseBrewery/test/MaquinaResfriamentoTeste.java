import com.bees.cervejaria.maquinas.MaquinaFervura;
import com.bees.cervejaria.maquinas.MaquinaResfriamento;
import com.bees.cervejaria.persistencia.Mosto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.bees.cervejaria.persistencia.Constantes.TEMPERATURA_FERVURA_MOSTO;

public class MaquinaResfriamentoTeste {

    MaquinaResfriamento maquina;

    @BeforeEach
    public void inicializa() {
        maquina = new MaquinaResfriamento();
    }

    @Test
    public void quandoResfriarMostoFiltrado_DeveReduzirTemperatura() {
        // given
        Mosto mosto = new Mosto();
        mosto.setTemperatura(TEMPERATURA_FERVURA_MOSTO);
        mosto.setFiltrado(true);

        // when
        Mosto mostoResultado = maquina.resfriar(mosto);

        // then
        Assertions.assertTrue(mostoResultado.getTemperatura() < TEMPERATURA_FERVURA_MOSTO);
    }

    @Test
    public void quandoResfriarMostoNaoFiltrado_DeveLancarExcecao() {
        // given
        Mosto mosto = new Mosto();
        mosto.setFiltrado(false);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.resfriar(mosto);
        });
    }
}
