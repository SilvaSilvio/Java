package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy=InheritanceType.JOINED) // Escolha de estratégia de herança
public class Usuario {	 
	@Id // Chave primária	
	@GeneratedValue // Serial (Auto increment)
	private Long id;
	private String login;
	private String senha;
	private String nome;
	@OneToMany(fetch = FetchType.LAZY, // Não carrega os telefones, somente se houver getTelefones
			cascade = CascadeType.ALL, // Se deletar usuário, todos seus telefones serão deletados  
			mappedBy="usuario") // Indica qual variável de Telefone está apontando para Usuário
	private List<Telefone> telefones;
}


