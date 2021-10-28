package atividade02_t2;

public class Abc extends Modem {

	private String tipoCabo;

	public Abc(String nome, String modelo, int velocidade, 
			   int quantidadePortas, String tipoCabo) {
		
		super(nome, modelo, velocidade, quantidadePortas);
		this.tipoCabo = tipoCabo;
	}	
	
	public int getQuantidadePortas() {
		return 2;
	}
	
	public String caboGrossoOuFino () {
		if (tipoCabo.toLowerCase().equals("10base2")) {
			return "fino";
			
		} else if (tipoCabo.toLowerCase().equals("10base5")) {
			return "grosso";
			
		} else {
			return "Indefinido";
		}		
	}
	
	
}
