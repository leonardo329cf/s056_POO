package atividade05_t1.item1;

public class Aluno {

	private String nome;
	private int nota;
	
	public Aluno() {}
	
	public Aluno(String nome, int nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

}
