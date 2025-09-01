package jokenpo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JokenpoTest {

    //papel (1) x papel (1) : 0
    //papel (1) x tesoura (3) : 2
    //papel (1) x pedra (2) : 1

    //tesoura (3) x tesoura (3) : 0
    //tesoura (3) x pedra (2) : 2

    // pedra (2) x pedra (2) : 0

    Jokenpo jkp;

    @BeforeEach
	public void setUp() {
		jkp = new Jokenpo();
	}

    @DisplayName("Testa Papel/Papel")
	@Test
	public void testPapelEmpate() {
		int resposta = jkp.jogar(1, 1);
		assertEquals(0, resposta);
	}

    @DisplayName("Testa Papel/Tesoura")
	@Test
	public void testPapelTesoura() {
		int resposta = jkp.jogar(1, 3);
		assertEquals(2, resposta);
	}

    @DisplayName("Testa Papel/Pedra")
	@Test
	public void testPapelPedra() {
		int resposta = jkp.jogar(1, 2);
		assertEquals(1, resposta);
	}

    @DisplayName("Testa Tesoura/Tesoura")
	@Test
	public void testTesouraEmpate() {
		int resposta = jkp.jogar(3, 3);
		assertEquals(0, resposta);
	}
    

    @DisplayName("Testa Tesoura/Pedra")
	@Test
	public void testTesouraPedra() {
		int resposta = jkp.jogar(3, 2);
		assertEquals(2, resposta);
	}

    @DisplayName("Testa Tesoura/Pedra")
	@Test
	public void testPedraEmpate() {
		int resposta = jkp.jogar(2, 2);
		assertEquals(0, resposta);
	}
}
