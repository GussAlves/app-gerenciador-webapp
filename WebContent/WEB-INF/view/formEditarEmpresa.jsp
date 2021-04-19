<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="entrada"/>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="ISO-8859-1">
<title>Editar Empresa</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<c:import url="asset/navBar.jsp" />

		<form action="${ entrada }" method="post">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="nome">Nome da empresa</label> <input type="text"
						class="form-control" placeholder="Nome" name="nome"
						value="${ empresa.nome }">
				</div>
				<div class="form-group col-md-6">
					<label for="data">Data de criação</label> <input type="text"
						class="form-control" name="data" placeholder="dd/mm/aaaa"
						value="<fmt:formatDate value="${ empresa.data }" pattern="dd/MM/yyyy" />">
				</div>
				<input type="hidden" name="id" value="${ empresa.id }" />
				<input type="hidden" name="acao" value="AtualizarEmpresa" />
				<button type="submit" class="btn btn-primary">Atualizar empresa</button>
		</form>

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