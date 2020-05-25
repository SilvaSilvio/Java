package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import lombok.Data;

@Entity
//@Data
public class Turma {
	@Id
	@GeneratedValue
	private Long id;
	private Date inicioAulas;
	private String salaBloco;
	private Boolean finalizada;
	@ManyToOne
	@JoinColumn(name="id_disciplina")
	@JsonIgnore
	private Disciplina disciplina;
	@ManyToOne
	@JoinColumn(name="id_professor")
	@JsonIgnore
	private Professor professor;
	@ManyToOne
	@JoinColumn(name="id_aluno_turma")
	@JsonIgnore
	private AlunoTurma alunoTurma;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getInicioAulas() {
		return inicioAulas;
	}
	public void setInicioAulas(Date inicioAulas) {
		this.inicioAulas = inicioAulas;
	}
	public String getSalaBloco() {
		return salaBloco;
	}
	public void setSalaBloco(String salaBloco) {
		this.salaBloco = salaBloco;
	}
	public Boolean getFinalizada() {
		return finalizada;
	}
	public void setFinalizada(Boolean finalizada) {
		this.finalizada = finalizada;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public AlunoTurma getAlunoTurma() {
		return alunoTurma;
	}
	public void setAlunoTurma(AlunoTurma alunoTurma) {
		this.alunoTurma = alunoTurma;
	}

}

