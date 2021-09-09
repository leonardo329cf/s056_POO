package atividade05_t1.item1;

import atividade05_t1.Aluno;

public class Turma {
	private String nomeTurma;
	private Aluno aluno1, aluno2;
	
	public Turma() {}
	
	public Turma(String nomeTurma, Aluno aluno1, Aluno aluno2) {
		this.nomeTurma = nomeTurma;
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
	}
	
	public Turma(String nomeTurma, String nomeAluno1, int notaAluno1,
								   String nomeAluno2, int notaAluno2) {
		this.nomeTurma = nomeTurma;
		this.aluno1 = new Aluno(nomeAluno1, notaAluno1);
		this.aluno2 = new Aluno(nomeAluno2, notaAluno2);
	}
	
	public String getNomeTurma() {
		return nomeTurma;
	}	
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}	
	public Aluno getAluno1() {
		return aluno1;
	}
	public void setAluno1(Aluno aluno1) {
		this.aluno1 = aluno1;
	}	
	public Aluno getAluno2() {
		return aluno2;
	}
	public void setAluno2(Aluno aluno2) {
		this.aluno2 = aluno2;
	}

}
