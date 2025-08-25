package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

public class CarrinhoTest {
	
	private Carrinho carrinho;
	
	@BeforeEach
	public void setUp() {
		carrinho = new Carrinho();
	}
	
	@Test
	public void testeAdicionar() {
		Produto produto = new Produto("Produto", 150.0);
		carrinho.addItem(produto);
		assertEquals(1, carrinho.getQtdeItems());
	}
	
	@Test
	public void testeValorTotal() {
		Produto produto1 = new Produto("Produto 1", 50.0);
		Produto produto2 = new Produto("Produto 2", 50.0);
		carrinho.addItem(produto1);
		carrinho.addItem(produto2);
		assertEquals(100.0, carrinho.getValorTotal());
	}
	
	@Test
	public void testeRemoverItem() throws ProdutoNaoEncontradoException {
		Produto produto = new Produto("Produto", 100.0);
		carrinho.addItem(produto);
		carrinho.removeItem(produto);
		assertEquals(0, carrinho.getQtdeItems());
	}

	

}
