<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=" var="entrada" />

<nav class="navbar navbar-expand-md navbar-light bg-light">
	<a class="navbar-brand" href="${ entrada }Home">Gerenciador</a>

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="${ entrada }Home">Home<span
					class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="${ entrada }CadastrarEmpresa">Cadastrar</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="${ entrada }ListarEmpresas">Listar</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${ entrada }Logout">Sair</a></li>
		</ul>
	</div>
</nav>