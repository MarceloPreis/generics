package generics;

public class Produto<T> {
	
	private T id;
	private double valor;
	private String dataFabicacao;
	private String dataVencimento;
	
	public Produto(T id, double valor) {
		this.id = id;
		this.valor = valor;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDataFabicacao() {
		return dataFabicacao;
	}

	public void setDataFabicacao(String dataFabicacao) {
		this.dataFabicacao = dataFabicacao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
}
