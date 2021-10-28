package formasGeometricasClasseAbstrata;

public class Retangulo extends FormaGeometrica {

	public Retangulo(String nome, float area) {
		super(nome, area);
	}

	@Override
	public float totalArea() {
		return area;
	}
}
