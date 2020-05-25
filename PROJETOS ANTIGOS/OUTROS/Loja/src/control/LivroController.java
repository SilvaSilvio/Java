package control;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.dao.LivroDAO;
import model.entity.Livro;

@ManagedBean
@SessionScoped
public class LivroController {
	private String titulo;
	private List<Livro> livros = new ArrayList<Livro>();
	private Livro livro;

	public void consultar() {
		try {
			livros = LivroDAO.consultar(titulo);
		} catch (Exception e) {
			Util.adicionarMensagem("Erro ao consultar livro: " + e.getMessage());
		}
	}

// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}