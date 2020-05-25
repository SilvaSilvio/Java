package Classes;

public class Retangulo {
	public int base;
	public int altura;

	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		return base * altura;
	}

	public int perimetro() {
		return 2 * base + 2 * altura;
	}

}
