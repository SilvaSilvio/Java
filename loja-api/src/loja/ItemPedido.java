package loja;

import java.io.Serializable;
import javax.persistence.*;


@Entity

public class ItemPedido{

	@Id
	@GeneratedValue
	private Livro livro;
	private int quantidade = 1;
	
	public double getValor() {
		return livro.getValor() * quantidade;
 	}
	
	public boolean equals(Object obj) {
		ItemPedido outroItem = (ItemPedido) obj;
		return this.livro.getCodigo() == outroItem.livro.getCodigo();
		
	}

   
}
