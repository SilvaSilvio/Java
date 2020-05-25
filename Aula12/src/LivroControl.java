import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loja.Livro;
import loja.LivroDao;
import loja.LojaException;

@WebServlet ("/LivroControl")
public class LivroControl extends HttpServlet{
	private static final long serialVersionsUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livro livro = new Livro();
		livro.setAutor(request.getParameter("autor"));
		livro.setValor(Double.parseDouble(request.getParameter("valor")));
		livro.setImagem(request.getParameter("imagem"));
		livro.setTitulo(request.getParameter("titulo"));
		
		try {
			LivroDao livroDao = new LivroDao();
			livroDao.inserir(livro);
		}catch(LojaException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("livors.jsp");
		rd.forward(request, response);
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
