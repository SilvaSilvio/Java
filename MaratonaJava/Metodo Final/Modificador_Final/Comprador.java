package Modificador_Final;

public class Comprador {
private String nome;



@Override
public String toString() {
	return  nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}
}