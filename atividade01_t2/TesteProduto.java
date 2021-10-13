package atividade01_t2;

public class TesteProduto {

	public static void main(String[] args) {

		Videogame p1;
		Radio p2;
		Tv p3;
		
		p1 = new Videogame("PS5", "Sony", 3000, 2);
		p2 = new Radio("RadinhoDePilha", "Philips", 30, 5);
		p3 = new Tv("Tv001", "LG", 1000, 40, "LCD");
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
		System.out.println(p3);
		System.out.println();

	}

}
