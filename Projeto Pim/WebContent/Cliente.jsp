<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="estilos/cliente.css">
  <title>Clientes</title>
</head>

<body>
<div id="topside"><p><a href="menu.HTML">CLIENT <font color="green">SGR</font></p></a> <a href="log screen.html"><p id="pe"><img src="imagens/logout.png" alt="Sair" id="im3"></p></a></div>


 <div id="menu">

<ul>
<li><img src="imagens/log-in.png" id="im"><a href="menu.html">Cadastro
<ul class="sub"><a href="USUARIOS.HTML"><img src="imagens/boss.png">  Usuarios</ul></a>
<ul class="sub"><a href="" target="_blank"><img src="imagens/target.png">Clientes</ul></a>
<ul class="sub"><a href=""><img src="imagens/order.png">Produtos</ul></a>
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

<div id=inder>
  



    <form method=get action=Cliente.php>


       <input type=text name=nome_Cliente id="nome" placeholder="Escreva o Nome"><br>
       <input type=tell name=cpf_Cliente maxlength=11 id="cpf" placeholder="Digite o Cpf"><br>
       <input type=tell name=telefone_Cliente maxlength="11" id="tel" placeholder="Digite o telefone"><br>
       <input type=text name=endereco_Cliente id="end" placeholder="Digite o endereço"><br>
      

      <input type=submit name=cadastro_cliente value=Cadastrar class="btn1" id='a1' >
      <input type=submit name=listar_cliente value=Listar class="btn1" id="a2">
      <input type=submit name=buscar_cliente value=Buscar class="btn1" id="a3">
    </form>
  


  </form>


</div>


 <p id="aia"> Nome</p> 
 <p id="aia2"> Cpf</p> 
 <p id="aia3"> Telefone</p> 
 <p id="aia4"> Endereço</p> 

</body>
</html>