package CALCULADORA;

public class Calculadora {
	
	public int somar(int... parcelas) {
		int resultado = 0;
		for(int v: parcelas) {
			resultado += v;
		}
		return resultado;
	}

}
