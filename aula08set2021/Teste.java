package aula08set2021;

public class Teste {

	public static void main(String[] args) {
		
//		Porta porta1 = new Porta("Branca", 2);
//		Porta porta2 = new Porta("Cinza", 1);
//		Janela janela1 = new Janela(3);
//		Janela janela2 = new Janela(4);
//		Casa casa = new Casa(100, porta1, porta2, janela1, janela2);
		
//		System.out.println("Area da casa: " + casa.getTamanhoEmMetros() +
//        "\nCor da porta 1: " + casa.getPorta1().getCor() +
//        "\nTamanho da porta 1: " + casa.getPorta1().getTamanho() + "m2" + 
//        "\nCor da porta 2: " + casa.getPorta2().getCor() +
//        "\nTamanho da porta 2: " + casa.getPorta2().getTamanho() + "m2" +
//        "\nTamanho da Janela 1: " + casa.getJanela1().getTamanho() + "m2" +
//        "\nTamanho da Janela 2: " + casa.getJanela2().getTamanho() + "m2");
		
		String temp = "";
		if (temp.isEmpty()) {
			System.out.println("String vazia");
		} else {
			System.out.println("String com conteudo");
		}

		Casa casa = new Casa(100, 
				             new Porta("Branca", 2), new Porta("Cinza", 1),
				             new Janela(3), new Janela(4));
		
		System.out.println(casa);

	}

}
