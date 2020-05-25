package AULA07;

public class ExemploTipoEmpacatador {

	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		System.out.println(i1.toString());
		System.out.println(i1.toBinaryString(i1.intValue()));
		System.out.println(i1.doubleValue());
		
		//ANTES DO JAVA 5;
		Double d1 = new Double(123.45);
		double d2 = d1.doubleValue();
		double d3 = d2 + d1.doubleValue();
		System.out.println(d3);
		
		//NO JAVA 5
		Double d5 = 123.45;
		double d6 = d5;
		double d7 = d5 + d6;
		System.out.println(d7);
		
	}

}
