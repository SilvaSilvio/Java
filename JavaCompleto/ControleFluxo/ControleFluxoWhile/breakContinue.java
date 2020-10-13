package ControleFluxoWhile;

public class breakContinue {

	/**
	 * Dado um valor de um carro descubra em quantas vezes o carro pode ser
	 * parcelado, porem as parcelas não podem ser menores que mil.
	 * 
	 */
	public static void main(String[] args) {
		double valorTotal = 30000;
		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela >= 1000) {
				System.out.println("Parcela " + parcela + " é : " + valorParcela);
			}
			else {
				System.out.println("Saindo do laço");
				break;
			}
			System.out.println("Fora do laço");

		}

	}

}