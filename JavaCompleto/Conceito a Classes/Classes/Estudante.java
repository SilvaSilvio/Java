package Classes;

public class Estudante {

	public String nome;
	public String matricula;
	public int idade;

	public void imprimirEstudante() {
		System.out.println("-------- Dados do estudante ----------");
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		if (idade == 0) {
			System.out.println("Estudante sem idade");
		} else {
			System.out.println("idade: " + idade);

		}
	}

}
