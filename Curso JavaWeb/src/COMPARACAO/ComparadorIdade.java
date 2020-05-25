package COMPARACAO;

import java.util.Comparator;

public class ComparadorIdade implements Comparator<Aluno> {

	@Override
	public int compare(Aluno arg0, Aluno arg1) {
		return arg0.getIdade() - arg1.getIdade();
	}

}
