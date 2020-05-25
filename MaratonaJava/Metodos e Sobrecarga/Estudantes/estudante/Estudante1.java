package Estudantes.estudante;

public class Estudante1 {
private String nome;
private int idade;
private double[] notas;

public void setPrint() {
	System.out.println("_______________________________________");
	System.out.println("O nome do Aluno é: " + this.nome);
	System.out.println("Sua idade é: " + this.idade);
	
	for (double aux : notas) {
		 System.out.println("sua nota é: " + aux);	
		}
	
}

public void calcularMedia() {
	String resultado = "null"; 
	double media = 0;
	for (double aux: notas) {
		media += aux;
	}
	media = media / notas.length;
		if (media < 6) {
			resultado = "Reprovado";
		}else {
			resultado = "Aprovado";
		}
		
	System.out.println("O aluno está: " + resultado );
}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public double[] getNotas() {
		return notas;
	}




}
