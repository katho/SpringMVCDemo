<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola, si puedes ver esto es que tu app funciona</h1>
	<a href='<c:url value="/about" />' >About</a>
	<a href='<c:url value="/usuario" />' >Usuario</a>
	<br>
	Atributo del controller about: <c:out value="${mensaje}"></c:out><br><br>
	Atributo de Session: <c:out value="${sessionScope.resultado}"></c:out><br><br>
	<br><br><br>
	Dato capturado en usuario.jsp: <c:out value="${usuarioForm}"></c:out><br>
	Dato capturado en usuario.jsp: <c:out value="${usuarioForm.nombre_usuario}"></c:out><br>
</body>
</html>