package FORNECEDOR;

public class Curso {
private String nome;
private LinguagemProgramacao linguagem;



public Curso(String nome, LinguagemProgramacao linguagem) {
	this.nome = nome;
	this.linguagem = linguagem;
}

public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}

public LinguagemProgramacao getLinguagem() {
	return linguagem;
}

public void setLinguagem(LinguagemProgramacao linguagem) {
	this.linguagem = linguagem;
}

@Override
public String toString() {
	return String.format("nome=: %-30s linguagem: %s", nome, linguagem);
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((linguagem == null) ? 0 : linguagem.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
}

}
