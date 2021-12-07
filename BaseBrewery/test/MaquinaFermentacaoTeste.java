import com.bees.cervejaria.maquinas.MaquinaFermentacao;
import com.bees.cervejaria.persistencia.Mosto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        mosto.setTemperatura(TEMPERATURA_MINIMA_RESFRIAMENTO_MOSTO);


    }

    public void quandoFermentarReceberMostoResfriadoForaDoIntervalo_DeveLancarExcecao(){

    }

}
