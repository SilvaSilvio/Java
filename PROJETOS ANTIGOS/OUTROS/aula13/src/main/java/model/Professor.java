package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="id_usuario") // Chave estrangeira que aponta para superclasse Usuário
public class Professor extends Usuario {
	private Double salario;
	@Enumerated(EnumType.ORDINAL)
	private TipoProfessor tipoProfessor;	
	
	// TODO: private List<Turma> turmas;
}
