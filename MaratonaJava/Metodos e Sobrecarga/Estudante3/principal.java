package Estudante3;

public class principal {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("");
		estudante.setNome("Silvio");
		estudante.setMatricula(01);
		estudante.setNotas(new double[] { 5 , 5, 9 });
		estudante.print();
		estudante.calcularMedia();
	}

}
