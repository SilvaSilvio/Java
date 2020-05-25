package teste;

public class Principal {

	public static void main(String... args) {
		Pessoa p = new Pessoa();
		p.setNome("Igor");
		p.setIdade(12);
		p.print();
		System.out.println(p);
	}

}
