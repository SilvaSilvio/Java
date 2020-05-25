package AULA07;

public class ExemploCaixaObject {

	public static void main(String[] args) {
		CaixaObject caixaComInteiro = new CaixaObject();
		caixaComInteiro.setValor(10);
		Integer item1 = (Integer) caixaComInteiro.getValor();
		System.out.println(item1);
		caixaComInteiro.setValor(10.0); //Note que estamos adicionando Double
		Integer item2 = (Integer) caixaComInteiro.getValor();
		System.out.println(item2);
	}

}
