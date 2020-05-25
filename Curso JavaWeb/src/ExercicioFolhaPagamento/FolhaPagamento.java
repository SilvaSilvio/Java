package ExercicioFolhaPagamento;

public class FolhaPagamento {

	public static void main(String[] args) {
		Empregado[] func = new Empregado[5];
		func[0] = new EmpresarioAssalariado("Jão", 1500.0);
		func[1] = new EmpregadoComissionado("José", 30000, 0.07);
		func[2] = new EmpregadoHorista("Jacó", 40, 55);

		for (Empregado emp : func) {
			System.out.println(emp);

			if (emp instanceof EmpregadoHorista) {
				EmpregadoHorista empHorista = (EmpregadoHorista) emp;
				System.out.printf("[Valor Hora: %.2f]", empHorista.getValorHora());
			}
			System.out.println();

		}
	}

}
