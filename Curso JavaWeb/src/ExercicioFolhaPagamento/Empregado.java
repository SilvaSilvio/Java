package ExercicioFolhaPagamento;

public abstract  class Empregado{
private String nome;


public abstract  double calcularRemuneracao();

public Empregado(String nome) {
	super();
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@Override
public String toString() {
	return "Empregado [nome=" + nome + "salario: " + String.valueOf(calcularRemuneracao()) +" ]";
}




	
}
