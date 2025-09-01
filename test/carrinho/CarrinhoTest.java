package carrinho;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

public class CarrinhoTest {

    private Carrinho carrinho;

    @BeforeEach
    public void setUp() {
        carrinho = new Carrinho();
    }

    @Test
    public void testCarrinhoVazio() {
        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal());
    }

    @Test
    public void testAdicionarItem() {
        Produto produto = new Produto("Caneta", 2.5);
        carrinho.addItem(produto);
        assertEquals(1, carrinho.getQtdeItems());
        assertEquals(2.5, carrinho.getValorTotal());
    }

    @Test
    public void testAdicionarMultiplosItens() {
        Produto p1 = new Produto("Lápis", 1.0);
        Produto p2 = new Produto("Borracha", 0.5);
        carrinho.addItem(p1);
        carrinho.addItem(p2);
        assertEquals(2, carrinho.getQtdeItems());
        assertEquals(1.5, carrinho.getValorTotal());
    }

    @Test
    public void testRemoverItemExistente() throws ProdutoNaoEncontradoException {
        Produto p1 = new Produto("Caderno", 10.0);
        carrinho.addItem(p1);
        carrinho.removeItem(p1);
        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal());
    }

    @Test
    public void testRemoverItemInexistente() {
        Produto p1 = new Produto("Livro", 20.0);
        assertThrows(ProdutoNaoEncontradoException.class, () -> carrinho.removeItem(p1));
    }

    @Test
    public void testEsvaziarCarrinho() {
        Produto p1 = new Produto("Caneta", 2.5);
        Produto p2 = new Produto("Lápis", 1.0);
        carrinho.addItem(p1);
        carrinho.addItem(p2);
        carrinho.esvazia();
        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal());
    }

    @Test
    public void testValorTotalComItens() {
        Produto p1 = new Produto("Caneta", 2.5);
        Produto p2 = new Produto("Lápis", 1.0);
        Produto p3 = new Produto("Borracha", 0.5);
        carrinho.addItem(p1);
        carrinho.addItem(p2);
        carrinho.addItem(p3);
        assertEquals(4.0, carrinho.getValorTotal());
    }
}