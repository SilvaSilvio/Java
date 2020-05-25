package CLIENTE;

public class Cliente {
	String nome;
	int idade;
	int telefone;

	public Cliente(String n, int i, int tel) {
		this.nome = n;
		this.idade = i;
		int telefone = tel;
	}
	
		@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	
}
