package atividade06_t1;

import java.util.ArrayList;

public class FamiliaLista {
	private String pai, mae;	
	private ArrayList<String> filhos = new ArrayList<String>();	
	
	// Método generico que permite receber N parametros
	// de filhos. Veremos isso na aula de 22/set proxima
	public FamiliaLista(String pai, String mae, String... filhosRecebidos) {
		this.pai = pai;
		this.mae = mae;
		
		for (String filho : filhosRecebidos) {
			this.filhos.add(filho);
		}		
//		for (int i=0; i < filhosRecebidos.length; i++) {
//			this.filhos.add(filhosRecebidos[i]);
//		}
	}
	
	public int numeroDeFilhos() {
		return filhos.size();		
	}

	@Override
	public String toString() {
		return "Nome do pai: " + pai + 
			   "\nNome da mae: " + mae + 
			   "\nFilhos: " + filhos;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}
	
}
