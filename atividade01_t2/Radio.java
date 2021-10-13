package atividade01_t2;

public class Radio extends Produto {

	private int potenciaRMS;

	public Radio(String nome, String marca, float preco, 
			     int potenciaRMS) {
		super(nome, marca, preco);
		this.potenciaRMS = potenciaRMS;
	}

	public int getPotenciaRMS() {
		return potenciaRMS;
	}

	public void setPotenciaRMS(int potenciaRMS) {
		this.potenciaRMS = potenciaRMS;
	}

	@Override
	public String toString() {
		return "Potencia RMS: " + potenciaRMS + "W\n" +
	           super.toString();
	}	
	
}
