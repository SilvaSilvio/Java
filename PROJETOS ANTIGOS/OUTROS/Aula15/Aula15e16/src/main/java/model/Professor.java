package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

//import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
//@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="id_usuario") // Chave estrangeira que aponta para superclasse Usuário
public class Professor extends Usuario {
	private Double salario;
	@Enumerated(EnumType.ORDINAL)
	private TipoProfessor tipoProfessor;	
	@OneToMany(mappedBy="professor")
	private List<Turma> turmas;
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}
	public void setTipoProfessor(TipoProfessor tipoProfessor) {
		this.tipoProfessor = tipoProfessor;
	}
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
}
