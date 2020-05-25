package Estudantes;

public class Estudante {
public String nome;
public int idade;
public String sexo;
public int cpf;
public static String periodo = "Primeiro";

public void imprimir(Estudante references) {
	System.out.println("____________________________");
	System.out.println(references.nome);
	System.out.println(references.idade);
	System.out.println(references.sexo);
	System.out.println(references.cpf);
	System.out.println(Estudante.periodo);
}


}
