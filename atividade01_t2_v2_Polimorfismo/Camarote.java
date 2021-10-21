package atividade01_t2_v2_Polimorfismo;

public class Camarote extends Ingresso {
	
	private int codigoPorta;

	public Camarote(float valor, String descricao, int codigoPorta) {
		super(valor, descricao);
		this.codigoPorta = codigoPorta;
	}
	
	public Camarote(int codigoPorta) {
		super(100, "Ingresso Camarote");
		this.codigoPorta = codigoPorta;
	}	
	
	public int getCodigoPorta() {
		return codigoPorta;
	}

	public void setCodigoPorta(int codigoPorta) {
		this.codigoPorta = codigoPorta;
	}

	@Override
	public String toString() {
		return descricao + ", Codigo da Porta: " + codigoPorta + ", valor: R$" + valor;
	}	

}
