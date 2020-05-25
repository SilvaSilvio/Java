package Interface;

public class Principal {

	public static void main(String... args) {
		Produto p = new Produto();
		p.setNome("Computer");
		p.setValor(2000);
		p.tributavel();
		p.transportavel();
		System.out.println(p);
				

	}

}
