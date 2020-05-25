package Exercicio;

public class Seminario {
	private String titulo;
	private Aluno[] aluno;
	private Professor professor;
	private Local local;

	public Seminario(String titulo) {
		super();
		this.titulo = titulo;

	}

	public void print() {
		System.out.println("SEMINÁRIOS");
		System.out.println("---------------------RELATÓRIO DE SEMIN�RIOS---------------------");
		System.out.println("Titulo: " + this.titulo);
		if(professor != null) {
		System.out.println("Professor Palestrante: " + professor.getNome());
		} else {
		System.out.println("Professor não cont�m nenhum semin�rio");
		}
		if(local != null) {
		System.out.println("Local:  Rua " + local.getRua() + " Bairro: " + local.getBairro());
		} else {
		System.out.println("Semin�rio sem local cadastrado");
		}
		if(aluno != null && aluno.length != 0) {
		System.out.println("Alunos participandos: ");
		for (Aluno alunos : aluno) {
			System.out.println(alunos.getNome());
		}
		}else {
			System.out.println("Aluno n�o cont�m nenhum semin�rio");
		}
		

	}

	public Seminario() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAluno() {
		return aluno;
	}

	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor prof) {
		this.professor = prof;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
