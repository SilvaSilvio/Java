package model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Aluno extends Turma{
private String matricula;
//private List<AlunoTurma>
}
