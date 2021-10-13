package atividade01_t2;

public class Produto {
	
	protected String nome, marca;
	protected float preco;
	
	public Produto(String nome, String marca, float preco) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
	           "Marca: " + marca + "\n" +
			   "Preço: R$" + preco;
	}
	
	
}
