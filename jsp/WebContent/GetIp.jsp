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
				<h1>Get Ip User</h1>
				<br>
				<%
					out.print("Olá usuário, seu IP é: " + request.getRemoteAddr());
				%>
			</div>
		</div>
		</main>

		<nav id="nav">
			<div class="innertube">
				<h3>Left Menu</h3>

				<ul>
					<li><a href="GetIp.jsp"> Get Ip User</a></li>
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