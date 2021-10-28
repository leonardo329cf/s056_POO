package atividade02_t2;

public class Xyz extends Modem {
	
	public Xyz(String nome, String modelo, int velocidade, int quantidadePortas) {
		super(nome, modelo, velocidade, quantidadePortas);		
	}

	public String altaOuBaixaVelocidade() {
		if (getVelocidade() > 1000) {
			return "alta velocidade";			
		} else {
			return "baixa velocidade";
		}
	}
	
	public int getQuantidadePortas() {
		return 4;
	}
	
	
}
