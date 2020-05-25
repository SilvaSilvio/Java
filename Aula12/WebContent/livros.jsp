<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LivroControl">
		Titulo: <input type="text" name="titulo"/><br/>
		Autor: <input type="text" name="autor"/> <br/>
		Imagem: <input type="text" name="imagem" /> <br/>
		Valor: <input type="text" name="valor"/><br/>
		<input type="submit" value="Cadastrar" />
	</form>

	<table width="100%">
		<tr>
			<th>Código</th>
			<th>Título</th>
			<th>Autor</th>
			<th>Imagem</th>
			<th>Valor</th>
		</tr>

		<jsp:useBean id="lista" scope="request" class="java.util.ArrayList" />
		<jsp:useBean id="lDao" scope="request" class="loja.LivroDao" />
		<%
			lista.addAll(lDao.consultar());
		%>
		<c:forEach items="${lista }" var="livro" />
		<tr>
			<td>${livro.codigo }</td>
			<td>${livro.titulo }</td>
			<td>${livro.autor }</td>
			<td>${livro.imagem }</td>
			<td>${livro.valor }</td>
		</tr>
	</table>

</body>
</html>