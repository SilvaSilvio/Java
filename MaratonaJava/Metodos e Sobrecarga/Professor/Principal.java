package Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Professor prof = new Professor();
prof.nome = "Silvio";
prof.cpf = 02075525252;
prof.idade = 20;

Professor prof2 = new Professor();
prof2.nome = "Sérgio";
prof2.cpf = 0303030;
prof2.idade = 129;


prof.imprimir(prof);
	}

}
