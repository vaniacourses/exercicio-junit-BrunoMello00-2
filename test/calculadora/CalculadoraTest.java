package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.soma(2, 3));
        assertEquals(0, calc.soma(0, 0));
        assertEquals(-1, calc.soma(-2, 1));
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtracao(3, 2));
        assertEquals(0, calc.subtracao(0, 0));
        assertEquals(-3, calc.subtracao(-2, 1));
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicacao(2, 3));
        assertEquals(0, calc.multiplicacao(0, 5));
        assertEquals(-2, calc.multiplicacao(-1, 2));
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divisao(6, 3));
        assertEquals(0, calc.divisao(0, 5));
        assertEquals(-2, calc.divisao(-4, 2));
    }

    @Test
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.divisao(5, 0));
    }

    @Test
    public void testSomatoria() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.somatoria(3)); // 3+2+1+0
        assertEquals(0, calc.somatoria(0));
        assertEquals(0, calc.somatoria(-1)); // Negativo retorna 0
    }

    @Test
    public void testEhPositivo() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.ehPositivo(0));
        assertTrue(calc.ehPositivo(5));
        assertFalse(calc.ehPositivo(-1));
    }

    @Test
    public void testCompara() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.compara(2, 2));
        assertEquals(1, calc.compara(3, 2));
        assertEquals(-1, calc.compara(1, 2));
    }
}