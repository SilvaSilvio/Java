package FORNECEDOR;

public class Aluno extends Pessoa {
	private Double nota;

	public Aluno(String nome, String telefone, double nota) {
		super(nome, telefone);
		this.nota = nota;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Dados Aluno - Nome: " + getNome() + " Telefone: " +getTelefone() + " Nota=" + nota;
	}
	
	

}
