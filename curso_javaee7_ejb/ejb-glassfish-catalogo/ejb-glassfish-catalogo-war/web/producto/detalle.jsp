<%@page import="com.formacionbdi.ejb3.models.entity.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    Producto producto = (Producto) request.getAttribute("producto");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Detalle Producto</title>
    </head>
    <body>
        <h3>Detalle Producto</h3>
        <p><a href="<c:url value="/listado.do" />" >volver</a></p>
        <p><span>Id:</span> <%=producto.getId()%></p>
        <p><span>Nombre:</span> <%=producto.getNombre()%></p>
        <p><span>Precio:</span> <%=producto.getPrecio()%></p>
        <p><span>Cantidad:</span> <%=producto.getCantidad()%></p>
    </body>
</html>