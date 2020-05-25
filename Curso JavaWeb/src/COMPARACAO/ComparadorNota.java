package COMPARACAO;

import java.util.Comparator;

public class ComparadorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno arg0, Aluno arg1) {

		return (int) (arg0.getNota() - arg1.getNota() * 100);
	}
}
