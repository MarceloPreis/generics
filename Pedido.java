package generics;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T> {
	
	private List<ProdutoX> produtos = new ArrayList<ProdutoX>();
	
	public void add(ProdutoX produto) {
		this.produtos.add(produto);
	}
	
	public String mostrar() {
		return this.produtos.toString();
	}
}
