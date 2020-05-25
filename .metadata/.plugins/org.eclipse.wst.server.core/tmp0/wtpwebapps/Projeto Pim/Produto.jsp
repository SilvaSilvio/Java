<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<link rel="stylesheet" type="text/css" href="estilos/produto.css">
  <title>Produto</title>
</head>

<body>
<div id="topside"><p><a href="">CLIENT <font color="green">SGR</font></p></a><a href="log screen.html"> <p id="pe"><img src="imagens/logout.png" alt="Sair" id="im3"></p></a></div>


 <div id="menu">

<ul>
<li><img src="imagens/log-in.png" id="im"><a href="menu.HTML">Cadastro</a>
<ul class="sub"><a href="USUARIOS.HTML" target="_blank"><img src="imagens/boss.png">  Usuarios</ul></a>
<ul class="sub"><a href="CLIENTE.HTML" target="_blank"><img src="imagens/target.png">Clientes</ul></a>
<ul class="sub"><a href="#"><img src="imagens/order.png">Produtos</ul></a>
</li>
<li><img src="imagens/shopping-bag.png" id="im5"><a href="">Vendas
<ul class="sub"><a href=""><img src="imagens/money.png" >A Vista</ul></a>
<ul class="sub"><a href=""><img src="imagens/discount.png">A Prazo</ul></a>
</li>
<li><a href=""><img src="imagens/stock.png" id="im1">Estoque</li></a>
<li><a href=""><img src="imagens/contact-us.png" id="im2">Fale conosco</li></a>
<li></li>
</ul>
</div>

<hr id="tag">
<div id="igg">
  <form method=get action=Produto.php>
     <input type=text name=produtoNome id="Nome" placeholder="Digite o Produto"><br>
       <input type=text name=produtoPreco_venda maxlength=11 id="valor" placeholder="Digite o Preço"><br>
      <input type=submit name=produtoCadastrar value=Cadastrar class="btn1" id='a1'>
      <input type=submit name=produtoListar value=Listar class="btn1" id='a2'>
      <input type=submit name=produtoBuscar value=Buscar class="btn1" id='a3'>
    </form>

</div>
<p id="aia">Produto</p> 
 <p id="aia2">Valor</p>

</body>
</html>