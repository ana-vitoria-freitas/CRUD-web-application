<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.elo7.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Vulnerabilidades</title>
</head>
<body>
<h2>Minha lista de Vulnerabilidades</h2>
	<ul>
		<c:forEach items="${vulnerabilidades}" var="entry">
			<li>${entry.key} -> ${entry.value}</li>
		</c:forEach>
	</ul>
</body>
<a href="/CRUD/deletarVulnerabilidade.html">Deletar vulnerabilidade</a><br>
<a href="/CRUD/atualizarVulnerabilidade.html">Atualizar vulnerabilidade</a><br>
<a href="/CRUD/cadastro.html">Adicionar vulnerabilidade</a>
</html>
