<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
	<title>Fornecedor</title>
	<meta charset="utf-8">
<body> 
	<fieldset>
		<legend>Cliente</legend>
		<form method=get action=Fornecedor.php>
			Nome<input type=text name="nome_Fornecedor"><br>
			CNPJ <input type=tell name="cnpj_Fornecedor" maxlength=11><br>
			<!--Verificar após a tabela fornecedor, pois estar aceitando apenas 11 digitos, sendo no total 14-->
			Descrição<br>
			<td><textarea class="form-control" name="descricao"></textarea><br/></td>
						
			<input type=submit name=cadastro_Fornecedor value=Cadastrar>
			
		</form>
	</fieldset> 

	</form>

</body>
</html>