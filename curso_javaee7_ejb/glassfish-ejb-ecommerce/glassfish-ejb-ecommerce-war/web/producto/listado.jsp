<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado Producto</title>
</head>
<body>
<h3>Listado Producto</h3>
<a href="<c:url value="/carro/ver.do"/>">Ver Carrito</a></p>
<p><a href="<c:url value="/form.do" />" >nuevo producto (+)</a></p>
<table>	
	<tr>
		<th>#</th>
		<th>Nombre</th>
		<th>Precio</th>
		<th>Cantidad</th>
		<th>Detalle</th>
                <th>Editar</th>
                <th>Eliminar</th>
	</tr>
	<c:forEach items="${productos}" var="producto">
	<tr>
		<td><c:out value="${producto.id}"/></td>
		<td><c:out value="${producto.nombre}"/></td>
		<td><c:out value="${producto.precio}"/></td>
		<td><c:out value="${producto.cantidad}"/></td>
                <td><a href="<c:url value="/carro/agregar.do?id=${producto.id}"/>">agregar al carro</a></td>
		<td><a href="<c:url value="/detalle.do?id=${producto.id}" />" >ver</a></td>
                <td><a href="<c:url value="/form.do?id=${producto.id}" />" >editar</a></td>
                <td><a onclick="return confirm('¿Seguro que desea eliminar?')" href="<c:url value="/eliminar.do?id=${producto.id}" />" >eliminar</a></td>
	</tr>
	</c:forEach>
</table>	
</body>
</html>