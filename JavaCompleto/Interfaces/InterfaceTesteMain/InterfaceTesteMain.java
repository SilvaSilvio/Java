package InterfaceTesteMain;

import Interfaces.Produto;

public class InterfaceTesteMain {

	public static void main(String[] args) {
		
		Produto p = new Produto("Geladeira", 50, 1000);
		p.calcularFrete();
		p.calcularImposto();
		System.out.println( p );
	
	}

}
