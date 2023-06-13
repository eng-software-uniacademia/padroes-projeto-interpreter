import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        CarroTurismo aluno = new CarroTurismo();
        aluno.setVoltas(10.0);
        aluno.setTempo(20.0);

        assertEquals(10.0, aluno.calcularNota());
    }

}