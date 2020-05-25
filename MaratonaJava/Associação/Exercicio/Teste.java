package Exercicio;

public class Teste {

	public static void main(String... args) {
		Aluno aluno1 = new Aluno("Silvio", 25);
		Aluno aluno2 = new Aluno("Beuga", 20);

		Seminario sem = new Seminario();
		sem.setTitulo("Como ser um programador foda");

		//Professor prof = new Professor("Gustavo", "Engenheiro de Software");
		//Local local = new Local("Rua Muraid Said", "Centro");

		//aluno1.setSeminario(sem);
		//aluno2.setSeminario(sem);

		//sem.setLocal(local);
		//sem.setProfessor(prof);
		sem.setAluno(new Aluno[] { aluno1, aluno2 });

		Seminario[] semArray = new Seminario[1];
		semArray[0] = sem;
		//prof.setSeminarios(semArray);

		// sem.setProfessor(new Professor[]{professor});	

		//aluno1.print();
		//prof.print();
		//local.print();
		sem.print();
		//prof.print();
	//	aluno1.print();
		//aluno2.print();

	}

}
