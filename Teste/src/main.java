
public class main {

	public static void main(String[] args) {
		somaPorMetodos somar = new somaPorMetodos();
		// System.out.println(somar.somar(4, 5));
		System.out.println(somar.somar(3, 8, 6));

		Pessoas p = new Pessoas("silvio");

		System.out.println(p);

		p.StatusPessoas();
	}

}
