package atividade02_t2;

public class Modem {
	
	private String nome;
	private String modelo;
	private int velocidade;
	private int quantidadePortas;
	
	public Modem(String nome, String modelo, int velocidade, int quantidadePortas) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.quantidadePortas = quantidadePortas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public String toString() {
		return "Modem [nome=" + nome + ", modelo=" + modelo + ", velocidade=" + velocidade + ", quantidadePortas="
				+ getQuantidadePortas() + "]";
	}	
	
}
