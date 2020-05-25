package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Telefone {	
	@Id
	@GeneratedValue
	private Long id;
	private String numero;
	@ManyToOne
	@JoinColumn(name = "id_usuario") // Chave estrangeira (coluna) que aponta para Usuário 
	@JsonIgnore //Parar Laço Infinito.
	private Usuario usuario;	
}
