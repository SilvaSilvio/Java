package ClassesTeste;

import java.util.Iterator;

import Classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {

		Estudante estudante = new Estudante();
		Estudante e = new Estudante();
		Estudante est = new Estudante();
		Estudante est1 = new Estudante();
		estudante.nome = "Silvio";
		estudante.idade = 18;
		estudante.matricula = "123";
		
		e.nome = "Aline";
		e.matricula = "124";
		est.nome = "Nay";
		est1.nome = "ara";
		

		estudante.imprimirEstudante();
		e.imprimirEstudante();
	}

}
