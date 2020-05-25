<%@page import="ClassMensagem.Mensagem"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Template</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<header id="header">
		<div class="innertube">
			<h1>Curso JSP</h1>
		</div>
	</header>

	<div id="wrapper">
		<main>
		<div id="content">
			<div class="innertube">
				<h1>CHAT</h1>
			<%
			String usu = request.getParameter("usu");
			if(usu != null){
				session.setAttribute("usuario", usu);
			}
			String usuario = (String) session.getAttribute("usuario");
			if(usuario == null){
									
			%>
			<form action="" method="post">
			Usuário: <input name="usu"/>
			<input type="submit" value="Entrar"/>
			</form>
			<% } else {
				String acao = request.getParameter("acao");
				if("sair".equals(acao)){
					session.removeAttribute("usuario");
					response.sendRedirect("chat.jsp");
				}else if("atualizar".equals(acao)){
					response.sendRedirect("chat.jsp");
				}else{
			%>
			<form action="" method="post">
			Mensagem: <input name="msg"/>
			<input type="submit" value="Entrar" />
			</form>
			<a href="chat.jsp?acao=atualizar">Atualizar</a>
			<a href="chat.jsp?acao=sair">Sair</a>
			<table>
			<jsp:useBean id="mensagens" scope="application" class="java.util.ArrayList"/>
			<%
			String msg = request.getParameter("msg");
			if (msg != null){
				Mensagem mensagem = new Mensagem();
				mensagem.setDescricao(msg);
				mensagem.setUsuario(usuario);
				mensagem.setIp(request.getRemoteHost());
				mensagens.add(mensagem);
			}
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			
			for( int i = mensagens.size() -1; i >= 0; i--){
				Mensagem m = (Mensagem) mensagens.get(i);
				%>
				<tr>
				<td><%= m.getUsuario() %></td>
				<td><%= sdf.format(m.getData()) %></td>
				<td><%= m.getDescricao() %></td>
				<td><%= m.getIp() %></td>
				</tr>
			<%
			}			
		}			
%>
		</table>
		<% 
		}
		%>
						
						
			</div>
		</div>
		</main>

		<nav id="nav">
			<div class="innertube">
				<h3>Left Menu</h3>

				<ul>
					<li><a href="GetIp.jsp"> Get Ip User</a></li>
					<li><a href="Enviar.jsp"> Formulário Nome </a></li>
					<li><a href="ExemploForward.html"> Forward</a></li>
					<li><a href="ExemploRedirect.html"> Redirect</a></li>
					<li><a href="#"> Linck 5</a></li>
					<li><a href="#"> Linck 6</a></li>
					<li><a href="#"> Linck 7</a></li>
				</ul>
				<h3>Left Menu</h3>

				<ul>
					<li><a href="#"> Linck 1</a></li>
					<li><a href="#"> Linck 2</a></li>
					<li><a href="#"> Linck 3</a></li>
					<li><a href="#"> Linck 4</a></li>
					<li><a href="#"> Linck 5</a></li>
					<li><a href="#"> Linck 6</a></li>
					<li><a href="#"> Linck 7</a></li>
				</ul>
				<h3>Left Menu</h3>

				<ul>
					<li><a href="#"> Linck 1</a></li>
					<li><a href="#"> Linck 2</a></li>
					<li><a href="#"> Linck 3</a></li>
					<li><a href="#"> Linck 4</a></li>
					<li><a href="#"> Linck 5</a></li>
					<li><a href="#"> Linck 6</a></li>
					<li><a href="#"> Linck 7</a></li>
				</ul>
			</div>
		</nav>
	</div>


	<footer id="footer">
		<div class="innertube">
			<p>Rodapé</p>
		</div>
	</footer>
</body>
</html>