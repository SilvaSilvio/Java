package ClassesTeste;

import Classes.Retangulo;

public class RetanguloTeste {

	Retangulo retangulo = new Retangulo(10, 2);

	public boolean testeCalcularArea() {
		
		int resultadoEsperado = 20;

		int resultado = retangulo.calcularArea();

		if (resultado == resultadoEsperado) {
			return true;
		} else {
			return false;
		}
	}

	public boolean testeCalcularPerimetro() {
		int resultadoEsperado = 24;
		int resultado = retangulo.perimetro();

		if (resultado == resultadoEsperado) {
			return true;
		} else {
			return false;
		}
	}
}
