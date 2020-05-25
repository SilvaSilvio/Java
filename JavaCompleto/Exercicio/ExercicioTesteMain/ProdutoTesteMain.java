package ExercicioTesteMain;

import Exercicio.Produto;
import Exercicio.Relatorio;

public class ProdutoTesteMain {

	public static void main(String[] args) {
		Produto p = new Produto("Arroz", 12);
		Relatorio r = new Relatorio();	
		r.RelatorioGenerico(p);
		
	}

}
