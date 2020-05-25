package Estudantes.estudante;

public class Principal {

	public static void main(String[] args) {
		// Estudante est = new Estudante();

		// double[] teste = {5, 7, 8};

		// est.imprimir();
		
		Estudante1 estudante = new Estudante1();
		/*estudante.nome = "Silvio";
		estudante.idade = 20;
		estudante.notas = new double[] {6, 8, 9 };
		estudante.print();
		estudante.calcularMedia();*/
		
		
		estudante.setNome("Sílvio");
		estudante.setIdade(20);
		estudante.setNotas(new double[] {1, 8, 8});
		estudante.setPrint();
		estudante.calcularMedia();
		
		System.out.println( (double)(8 + 8 + 1) / 3);
		
		
	}

}
