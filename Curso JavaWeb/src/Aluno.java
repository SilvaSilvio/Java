
public class Aluno {

public int matricula;
public String nome;
public double media;

public void dadosAluno() {
	System.out.println("Matricula: " + matricula);
	System.out.println("Nome: " + nome);
}
public double calcularmedia() {
	for (int i = 0; i <=4; i++) {
		System.out.printf("Notas do %i aluno", i++);

	}
	
	return media;
}


}

