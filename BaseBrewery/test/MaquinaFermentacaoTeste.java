import com.bees.cervejaria.maquinas.MaquinaFermentacao;
import com.bees.cervejaria.persistencia.Cerveja;
import com.bees.cervejaria.persistencia.Mosto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.bees.cervejaria.persistencia.Constantes.TEMPERATURA_MEDIA_RESFRIAMENTO_MOSTO;
import static com.bees.cervejaria.persistencia.Constantes.TEMPERATURA_MINIMA_RESFRIAMENTO_MOSTO;


public class MaquinaFermentacaoTeste {
    MaquinaFermentacao maquina;

    @BeforeEach
    public void inicializa() {
        maquina = new MaquinaFermentacao();
    }

    @Test
    public void quandoFermentarReceberMostoResfriadoDentroDoIntervalo_DeveRetornarCerveja() {
        //given
        Mosto mosto = new Mosto();
        mosto.setTemperatura(TEMPERATURA_MEDIA_RESFRIAMENTO_MOSTO);

        //when
        Cerveja cerveja = maquina.fermentar(mosto);

        //then
        Assertions.assertNotNull(cerveja);
    }

    @Test
    public void quandoFermentarReceberMostoResfriadoForaDoIntervalo_DeveLancarExcecao(){
        //given
        Mosto mosto = new Mosto();
        mosto.setTemperatura(50);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            maquina.fermentar(mosto);
        });
    }

}
