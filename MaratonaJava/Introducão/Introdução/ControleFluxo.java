package Introdução;

public class ControleFluxo {
public void main(String[] args) {
	int idade = 20;
	String status;
	
	/*if (idade <18) {
		System.out.println("N�o aduto");
	} else {
		System.out.println("N�o aduto");
	}
	*/
	status = idade < 20 ? "N�o Aduto" : "Adulto";
	System.out.println(status);
}
}