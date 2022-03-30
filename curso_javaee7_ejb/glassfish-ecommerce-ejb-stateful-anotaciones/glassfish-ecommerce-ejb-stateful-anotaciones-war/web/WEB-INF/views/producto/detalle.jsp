<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.formacionbdi.ecommerce.ejb.video.models.entity.Producto"%>
<%
	Producto producto = (Producto) request.getAttribute("producto");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detalle Producto</title>
</head>
<body>
<h3>Detalle Producto</h3>
<p><span>Id:</span> <%=producto.getId()%></p>
<p><span>Nombre:</span> <%=producto.getNombre()%></p>
<p><span>Precio:</span> <%=producto.getPrecio()%></p>
<p><span>Cantidad:</span> <%=producto.getCantidad()%></p>
</body>
</html>