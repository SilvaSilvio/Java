package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

//import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
//@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="id_usuario")
public class Aluno extends Usuario {
	private String matricula;
	@OneToMany
	private List<Turma> turmas;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
}
