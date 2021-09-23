package atividade06_t1;

public class TesteLista {

	public static void main(String[] args) {
		
		FamiliaLista familia = new FamiliaLista("Joao", "Maria", 
				"Cesar", "Douglas", "Gabrielle", "Leonardo");
//		FamiliaLista familia = new FamiliaLista("Joao", "Maria");
		
		Endereco endereco = new Endereco("Av Borges de Medeiros", 1001, 
				"Apto 33", "90003-122", "RS", "Brasil");
//		Endereco endereco = new Endereco("Av Borges de Medeiros", 1001, 
//				"90003-122", "RS", "Brasil");
		
		Banco contaBanco = new Banco("Banco do Brasil", 0001, 112233, 
				"333.111.222-44", "51 993442211");
//		Banco contaBanco = new Banco("Banco do Brasil", 0001, 112233, 
//				"333.111.222-44");
		
		FuncionarioLista funcionario1 = new FuncionarioLista(endereco, contaBanco, 
				familia, 400, "Contabilidade", "Joao da Silva", "01/01/1990");
		
		System.out.println(funcionario1);
		
		System.out.println("Funcionario possui filhos? " + 
				(funcionario1.possuiFilhos() ? "sim":"nao"));
		
		System.out.println("Funcionario possui um salário " +
				funcionario1.statusSalario());

	}

}
