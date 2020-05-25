package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Disciplina {
	@Id
	@GeneratedValue
private long id;
private String nome;
private String descricao;
private Integer horaMes;


}
