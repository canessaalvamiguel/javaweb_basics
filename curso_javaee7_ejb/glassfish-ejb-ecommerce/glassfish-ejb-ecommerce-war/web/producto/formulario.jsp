<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario Producto</title>
</head>
<body>
<h3>Formulario Producto</h3>
<form method="post" action="<%= application.getContextPath() %>/guardar.do">
<input type="hidden" name="id" value="<c:out value="${producto.id}"/>"/>

	<span>Nombre</span> <input type="text" name="nombre" value="<c:out value="${producto.nombre}"/>"/><br />
	<span>Cantidad</span> <input type="text" name="cantidad" value="<c:out value="${producto.cantidad}"/>"/><br />
	<span>Precio</span> <input type="text" name="precio" value="<c:out value="${producto.precio}"/>"/><br />
	<input type="submit" name="guardar" value="Guardar"/>
</form>
</body>
</html>