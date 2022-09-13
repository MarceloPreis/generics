package generics;

public class ProdutoX {
	private int id;
	private String fabricante;
	private int unidDisponiveis;
	
	public ProdutoX(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getUnidDisponiveis() {
		return unidDisponiveis;
	}
	public void setUnidDisponiveis(int unidDisponiveis) {
		this.unidDisponiveis = unidDisponiveis;
	}
	
	
}
