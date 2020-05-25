package AULA3;

public class Pessoa {
public String nome;
public static String especie;
public static int quantidade;

public Pessoa(String n) {
	nome = n;
	quantidade++;
}
public void imprimirDados() {
	//
	//System.out.printf("Nome: %s \tEspécie: s% \tQuantidade: %d\n", nome, especie, quantidade);
	System.out.println("nome" + nome);
	System.out.println("Quantidade" + quantidade);
	System.out.println("especie" + especie);
}

public static void imprimirDadosClasse() {
	System.out.printf("Espécie: %s \t Quantidade: %d\n", especie, quantidade);
}

}
