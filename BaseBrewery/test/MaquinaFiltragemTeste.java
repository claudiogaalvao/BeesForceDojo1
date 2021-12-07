import com.bees.cervejaria.maquinas.MaquinaBrassagem;
import com.bees.cervejaria.maquinas.MaquinaFiltragem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaFiltragemTeste {

    MaquinaFiltragem maquina;

    @BeforeEach
    public void inicializa() {
        maquina = new MaquinaFiltragem();
    }

    @Test
    public void quandoFiltrarReceberMalte_DeveRetornarMalte() {

    }

}
