package atividade06_t1;

public class Teste {

	public static void main(String[] args) {
		
		Familia familia = new Familia("Joao", "Maria", "Cesar", 
				"Douglas", "Gabrielle");
//		Familia familia = new Familia("Joao", "Maria");
		
		Endereco endereco = new Endereco("Av Borges de Medeiros", 1001, 
				"Apto 33", "90003-122", "RS", "Brasil");
//		Endereco endereco = new Endereco("Av Borges de Medeiros", 1001, 
//				"90003-122", "RS", "Brasil");
		
		Banco contaBanco = new Banco("Banco do Brasil", 0001, 112233, 
				"333.111.222-44", "51 993442211");
//		Banco contaBanco = new Banco("Banco do Brasil", 0001, 112233, 
//				"333.111.222-44");
		
		Funcionario funcionario1 = new Funcionario(endereco, contaBanco, 
				familia, 400, "Contabilidade", "Joao da Silva", "01/01/1990");
		
		System.out.println(funcionario1);
		
		System.out.println("Funcionario possui filhos? " + 
				(funcionario1.possuiFilhos() ? "sim":"nao"));
		
		System.out.println("Funcionario possui um sal�rio " +
				funcionario1.statusSalario());

	}

}
