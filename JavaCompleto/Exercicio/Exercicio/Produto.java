package Exercicio;

public class Produto implements Tributavel {
String nome;
double preco;
double precofinal;
public Produto(String nome, double preco) {
	this.nome = nome;
	this.preco = preco;
}
@Override
public double valorTributavel() {
	 this.precofinal = this.preco + ( preco * IMPOSTO );	
	return precofinal;
}
}
