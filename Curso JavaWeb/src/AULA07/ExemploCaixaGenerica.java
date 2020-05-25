package AULA07;

public class ExemploCaixaGenerica {

	public static void main(String[] args) {
		CaixaGenerica<Integer> caixaComInteiro = new CaixaGenerica<Integer>();
		caixaComInteiro.setValor(10);
		// caixaComInteiro.setValor(10.0);
		Integer umInteiro = caixaComInteiro.getValor();
		System.out.println(umInteiro);

		CaixaGenerica<Double> caixaComDouble = new CaixaGenerica<Double>();
		caixaComDouble.setValor(10.0);
		Double umDouble = caixaComDouble.getValor();
		System.out.println(umDouble);
		
		CaixaGenerica<String> caixaComString = new CaixaGenerica<String>();
		caixaComString.setValor("Amor");
		String umaString = caixaComString.getValor();
		System.out.println(umaString);
	
	}
		
}
