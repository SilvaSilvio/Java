package ClassesTesteMain;

import ClassesTeste.RetanguloTeste;

public class RetanguloMain {
	public static void main(String[] args) {
		RetanguloTeste teste = new RetanguloTeste();
		boolean resultadoArea;
		boolean resultadoPerimetro;

		resultadoArea = teste.testeCalcularArea();
		resultadoPerimetro = teste.testeCalcularPerimetro();
		
		System.out.println(resultadoArea);
		System.out.println(resultadoPerimetro);

	}

}
