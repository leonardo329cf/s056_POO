package atividade02_t2;

public class TestModems {

	public static void mostrarModem (Modem modem) {
		System.out.println(modem);
	}
	
	public static void main(String[] args) {
		
		Abc modemAbc = new Abc("Modem 1", "ABC", 500, 1, "10base2");		
		Xyz modemXyz = new Xyz("Modem 2", "XYZ", 900, 1);

		mostrarModem(modemAbc);
		mostrarModem(modemXyz);
		
		System.out.println("Tipo de cabo: " + 
							modemAbc.caboGrossoOuFino());
		
		System.out.println("Velocidade de operacao: " + 
							modemXyz.altaOuBaixaVelocidade());
		
	}

}
