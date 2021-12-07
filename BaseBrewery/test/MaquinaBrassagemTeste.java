import com.bees.cervejaria.maquinas.MaquinaBrassagem;
import com.bees.cervejaria.persistencia.EstadoMalte;
import com.bees.cervejaria.persistencia.Malte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaBrassagemTeste {

    MaquinaBrassagem maquina;

    @BeforeEach
    public void inicializa() {
        maquina = new MaquinaBrassagem();
    }

    @Test
    public void testarCozinharMalte(){
        //given
        Malte malte = new Malte(EstadoMalte.MOIDO);

        //when
        Malte malteRetornado = maquina.cozinhar(malte);

        //then
        Assertions.assertEquals(EstadoMalte.COZIDO, malteRetornado.getEstado());


    }
}

