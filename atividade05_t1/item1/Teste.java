package atividade05_t1.item1;

import atividade05_t1.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao da Silva");
		aluno1.setNota(9);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria da Silva");
		aluno2.setNota(8);
		
		Turma turma1 = new Turma();
		turma1.setNomeTurma("Turma da S056");
		turma1.setAluno1(aluno1);
		turma1.setAluno2(aluno2);
		
		System.out.println("Turma: " + turma1.getNomeTurma());
		System.out.println("Aluno1 nome: " + turma1.getAluno1().getNome() + 
				                ", nota: " + turma1.getAluno1().getNota());
		System.out.println("Aluno2 nome: " + turma1.getAluno2().getNome() + 
                                ", nota: " + turma1.getAluno2().getNota());
	}
	
}
