<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="entrada" />

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Gerenciador</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous" />
<style>
.h4 {
	padding-left: 20px;
}

.col>p {
	font-size: 1.2rem;
}
</style>
</head>

<body>

	<div class="container">

		<c:import url="asset/navBar.jsp" />

		<h4 style="margin-top: 22px;">Bem vindo ao Gerenciador de
			empresas com Java utilizando a tecnologia Servlet + Jpa + Tomcat</h4>
		<hr />

		<div class="row home">
			<div class="col">
				<a href="${ entrada }?acao=CadastrarEmpresa">Cadastrar nova
					empresa</a><br> <a href="${ entrada }?acao=ListarEmpresas">Lista
					de empresas</a>

			</div>

			<div class="col">
				<c:if test="${ not empty empresa }">
					<p>
						* Empresa <strong> ${ empresa.nome } </strong> cadastrada
					</p>
				</c:if>
			</div>
		</div>



	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
		crossorigin="anonymous"></script>
</body>
</html>