package Estudantes;

//import Carro.Carro;

public class teste {

	public static void main(String[] args) {
	Estudante e = new Estudante();
	//Carro  c = new Carro();
	e.nome= "Silvio";
	e.cpf = 02020202020;
	e.idade = 19;
	e.sexo = "masc";
	//Estudante.periodo = "Terceiro";
	
	Estudante ee = new Estudante();
	ee.nome = "pirates";
	ee.cpf = 2020112102;
	ee.idade = 12;
	ee.sexo="Fem";
	
	
	
	
	e.imprimir(e);
	ee.imprimir(ee);
	}

}
