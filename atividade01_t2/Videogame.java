package atividade01_t2;

public class Videogame extends Produto {

	private int controles;

	public Videogame(String nome, String marca, float preco, 
					 int controles) {
		super(nome, marca, preco);
		this.controles = controles;
	}

	public int getControles() {
		return controles;
	}

	public void setControles(int controles) {
		this.controles = controles;
	}

	@Override
	public String toString() {
		return "Numero de controles: " + controles + "\n" +
				super.toString();
	}
	
	
}
