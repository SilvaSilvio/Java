package Estudante3;

public class Estudante {
	private String nome;
	private int matricula;
	private double[] notas;

	public Estudante(String nome) {
		this.nome = nome;
	}

	public void print() {
		System.out.println("Dados Aluno");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		for (double nota : notas) {
			System.out.println("notas: " + nota);
		}
	}

	public void calcularMedia() {
		String resultado = "";
		double media = 0;
		for (double nota : notas) {
			media += nota / notas.length;
		}
		// media = nota / notas.length;
		System.out.println("Média: " + media);
		if (media < 6) {
			resultado = "Reprovado";
		} else {
			resultado = "Aprovado";
		}
		System.out.println("O aluno está " + resultado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
