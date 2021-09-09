package atividade05_t1.item2;

public class Teste {

	public static void main(String[] args) {
		
//		Filho filho1 = new Filho("Joao");
//		Filho filho2 = new Filho("Maria");
//		Mae mae = new Mae("Mae", filho1, filho2);
		
		Mae mae = new Mae("Mae", new Filho("Joao"), new Filho("Maria"));
		
		System.out.println("Nome da mae: " + mae.getNomeMae());
		System.out.println("Nome do filho 1: " + mae.getFilho1().getNome());
		System.out.println("Nome do filho 2: " + mae.getFilho2().getNome());
	}

}
