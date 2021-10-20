package atividade01_t2_v2;

public class Vip extends Ingresso {

	private String horaMaximaChegada;

	public Vip(float valor, String descricao, String horaMaximaChegada) {
		super(valor, descricao);
		this.horaMaximaChegada = horaMaximaChegada;
	}
	
	public Vip(String horaMaximaChegada) {
		super(70, "Ingresso VIP perto do palco");
		this.horaMaximaChegada = horaMaximaChegada;
	}	

	public String getHoraMaximaChegada() {
		return horaMaximaChegada;
	}

	public void setHoraMaximaChegada(String horaMaximaChegada) {
		this.horaMaximaChegada = horaMaximaChegada;
	}

	@Override
	public String toString() {
		return "Vip [horaMaximaChegada=" + horaMaximaChegada + ", valor=" + valor + ", descricao=" + descricao + "]";
	}
	
	
}
