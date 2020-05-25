package Aula12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AvaliacaoCredito
 */
@WebServlet(name = "avaliacaocredito", urlPatterns = { "/avaliacaocredito" })
public class AvaliacaoCredito extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String salarioStr = request.getParameter("salario");
		double salario = Double.parseDouble(salarioStr);
		String resposta;
		if (salario >= 10000) {
			resposta = "Aprovado";
		} else {
			resposta = "Reprovado";

		}
		request.getSession().setAttribute("resposta", resposta);
		RequestDispatcher rd = request.getRequestDispatcher("resposta.jsp");
	rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
