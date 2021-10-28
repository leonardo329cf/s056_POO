package formasGeometricasClasseAbstrata;

public class Triangulo extends FormaGeometrica {
	
	public Triangulo(String nome, float area) {
		super(nome, area);
	}

	@Override
	public float totalArea() {
		return area;
	}

}
