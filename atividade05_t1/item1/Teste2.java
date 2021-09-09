package atividade05_t1.item1;

import atividade05_t1.Aluno;

public class Teste2 {

	public static void main(String[] args) {
		
//		Aluno aluno1 = new Aluno("Joao da Silva", 9);		
//		Aluno aluno2 = new Aluno("Maria da Silva", 8);		
//		Turma turma1 = new Turma("Turma da S056", aluno1, aluno2);
		
		Turma turma1 = new Turma("Turma da S056", 
								 new Aluno("Joao da Silva", 9), 
								 new Aluno("Maria da Silva", 8));
		
		System.out.println("Turma: " + turma1.getNomeTurma());
		System.out.println("Aluno1 nome: " + turma1.getAluno1().getNome() + 
				                ", nota: " + turma1.getAluno1().getNota());
		System.out.println("Aluno2 nome: " + turma1.getAluno2().getNome() + 
                                ", nota: " + turma1.getAluno2().getNota());
	}
	
}
