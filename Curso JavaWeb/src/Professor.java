
public class Professor {
public String nome;
public double salario;

public Professor(String nome, double salario) {
	this.nome = nome;
	this.salario=salario;
}

public void dadosProfessor() {
System.out.printf("Nome: %s Salario: %f\n", nome, salario);
}


}
