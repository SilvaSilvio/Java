package loja;

import javax.persistence.*;

@Entity
public class Livro {
	@Id
	/*@GeneratedValue(generator = "livro_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "livro_seq", sequenceName = "livro_seq", initialValue = 1, allocationSize = 1)
	*/
	private int codigo;
	private String titulo;
	private String autor;
	private double valor;
	private String imagem;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
