
public class Funcionario {
private String nome;
private double vendasBrutas;
private double salario = 200;

public Funcionario(String nome, double vendasBrutas) {
	this.nome = nome;
	this.vendasBrutas = vendasBrutas;
	this.calcularSalario();
}


private void calcularSalario() {
	//salario = vendasBrutas * 8 / 100;
	this.salario = (long)(20000d + 0.08*((double)this.vendasBrutas)); 
}


void mostrarDados() {
	System.out.println("nome: " + this.getNome());
	System.out.println("A venda Bruta do funcionário é: " + this.getVendasBrutas());
	System.out.println("Salario: " + this.getSalario());
}

public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public double getVendasBrutas() {
	return vendasBrutas;
}


public void setVendasBrutas(double vendasBrutas) {
	this.vendasBrutas = vendasBrutas;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


}
