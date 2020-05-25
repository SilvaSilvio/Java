package Classe_Abstrato;

public class Principal {

	public static void main(String[] args) {
	Gerente g = new Gerente("Silvio", 0207442322, 1100);
	
	Vendedor v = new Vendedor("Beuga", 02002002020, 1100, 100);
	g.calcularSalario();
	v.calcularSalario();
	
	
	System.out.println(g);
	System.out.println("-------------------");
	System.out.println(v);
		
				
		
	}

}
