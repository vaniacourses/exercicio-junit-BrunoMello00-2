package jokenpo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JokenpoTest {

    @Test
    public void testEmpatePapel() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(0, jkp.jogar(1, 1));
    }

    @Test
    public void testEmpatePedra() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(0, jkp.jogar(2, 2));
    }

    @Test
    public void testEmpateTesoura() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(0, jkp.jogar(3, 3));
    }

    @Test
    public void testPapelVencePedra() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(1, jkp.jogar(1, 2));
    }

    @Test
    public void testPedraVenceTesoura() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(1, jkp.jogar(2, 3));
    }

    @Test
    public void testTesouraVencePapel() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(1, jkp.jogar(3, 1));
    }

    @Test
    public void testPedraPerdeParaPapel() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(2, jkp.jogar(2, 1));
    }

    @Test
    public void testTesouraPerdeParaPedra() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(2, jkp.jogar(3, 2));
    }

    @Test
    public void testPapelPerdeParaTesoura() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(2, jkp.jogar(1, 3));
    }

    @Test
    public void testOpcaoInvalidaJogador1() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(-1, jkp.jogar(0, 1));
        assertEquals(-1, jkp.jogar(4, 2));
        assertEquals(-1, jkp.jogar(-1, 3));
    }

    @Test
    public void testOpcaoInvalidaJogador2() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(-1, jkp.jogar(1, 0));
        assertEquals(-1, jkp.jogar(2, 4));
        assertEquals(-1, jkp.jogar(3, -1));
    }

    @Test
    public void testAmbosInvalidos() {
        Jokenpo jkp = new Jokenpo();
        assertEquals(-1, jkp.jogar(0, 0));
        assertEquals(-1, jkp.jogar(4, 4));
        assertEquals(-1, jkp.jogar(-1, -1));
    }
}