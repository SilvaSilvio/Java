package Exercicio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	private Aluno[] alunos;

	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
}
	public void print() {
	//	System.out.println("PROFESSOR");
		System.out.println("---------------------RELATÓRIO DE PROFESSOR---------------------");
		System.out.println("Nome do Professor:" + this.nome);
		System.out.println("Especialidade:" + this.especialidade);
		if (seminarios != null && seminarios.length != 0) {
		System.out.println("Seminários participantes ");
		for(Seminario sem: seminarios) {
			System.out.println(sem.getTitulo() + " ");
		}
		}else {
		System.out.println("O professor não contém nenhum seminário");	
		
		}
	
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

}
