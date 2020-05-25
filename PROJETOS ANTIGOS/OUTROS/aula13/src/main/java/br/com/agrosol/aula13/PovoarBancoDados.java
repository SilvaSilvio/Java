package br.com.agrosol.aula13;

import java.util.Arrays;
import java.util.List;

import model.GenericDAO;
import model.Telefone;
import model.Usuario;

public class PovoarBancoDados {
	public static void main(String[] args) throws Exception {				
		Telefone t1 = new Telefone();
		t1.setNumero("111");
		Telefone t2 = new Telefone();
		t2.setNumero("222");
		Telefone t3 = new Telefone();
		t3.setNumero("333");
		Telefone t4 = new Telefone();
		t4.setNumero("444");

		Usuario u1 = new Usuario();
		u1.setNome("Jair");
		Usuario u2 = new Usuario();
		u2.setNome("Bruna");
		Usuario u3 = new Usuario();
		u3.setNome("Ricardo");

		t1.setUsuario(u1);
		t2.setUsuario(u1);
		t3.setUsuario(u2);
		t4.setUsuario(null);

		u1.setTelefones(Arrays.asList(t1, t2));
		u2.setTelefones(Arrays.asList(t3));
		u3.setTelefones(null);

		GenericDAO.save(u1);
		GenericDAO.save(u2);
		GenericDAO.save(u3);
		GenericDAO.save(t4);
		
		System.out.println("Usuários: ");
		List<Usuario> pessoas = GenericDAO.findAll(Usuario.class);
		for (Usuario pessoa : pessoas) {
			System.out.println("Nome: "+pessoa.getNome());
			System.out.println("Login: "+pessoa.getLogin());			
		}
	}

}
