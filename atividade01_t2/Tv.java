package atividade01_t2;

public class Tv extends Produto {

	private int tamanho;
	private String tipo;
	
	public Tv(String nome, String marca, float preco, 
			  int tamanho, String tipo) {
		
		super(nome, marca, preco);
		this.tamanho = tamanho;
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Tamanho da TV: " + tamanho + "\"\n" +
	           "Tipo da TV: " + tipo + "\n" +
				super.toString();
	}
	
	
}
