package atividade05_t1.item2;

public class Mae {
	
	private String nomeMae;
	private Filho filho1, filho2;
	
	public Mae(String nomeMae, Filho filho1, Filho filho2) {
		this.nomeMae = nomeMae;
		this.filho1 = filho1;
		this.filho2 = filho2;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Filho getFilho1() {
		return filho1;
	}
	public void setFilho1(Filho filho1) {
		this.filho1 = filho1;
	}
	public Filho getFilho2() {
		return filho2;
	}
	public void setFilho2(Filho filho2) {
		this.filho2 = filho2;
	}
	
}
