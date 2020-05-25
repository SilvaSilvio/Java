package Carro;

import java.util.Scanner;

public class Carro {
	Scanner scan = new Scanner(System.in);
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private int[] parcelas;

	public Carro() {
		System.out.println("Dentro do metodo!!");
	}
	
	{
	parcelas = new int[100];
	for(int parcela : parcelas) {
		System.out.println(parcela);
	}
	{
		int i;
		parcelas = new int[100];
		for (i = 1; i <= 100; i++) {
		parcelas[i - 1] = i;
		}
	}
	
		
	}
	

	public void print() {
		System.out.println("__________________________________");
		System.out.println("O carro a ser comprado será? ");
		System.out.println("Placa: " + this.placa);
		System.out.println("Modelo " + this.modelo);
		System.out.println("cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
	}

	public void teste() {
		System.out.println("Vamos começar!!!!");
		System.out.println("Digite a placa do carro: ");
		placa = scan.nextLine();
		System.out.println("Digite o modelo do seu veículo: ");
		modelo = scan.nextLine();
		System.out.println("digite a cor: ");
		cor = scan.nextLine();
		System.out.println("Digite o ano do veículo: ");
		ano = scan.nextInt();
	}

	public void imprimir(String placa, String modelo, String cor) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
	}

	public void imprimir(String placa, String modelo, String cor, int ano) {
		imprimir(placa, modelo, cor);
		this.ano = ano;

	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
