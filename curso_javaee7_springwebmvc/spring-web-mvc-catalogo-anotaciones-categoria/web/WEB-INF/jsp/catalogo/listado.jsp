<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${titulo}"/></title>
    </head>
    <body>
        <h3><c:out value="${titulo}"/></h3>

        <p><a href="<c:url value="/catalogo/form.htm"/>">Agregar Producto (+)</a></p>
        <table>
            <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Categoría</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </tr>
            <c:forEach items="${productos}" var="producto">
                <tr>
                    <td><c:out value="${producto.id}"/></td>
                    <td><c:out value="${producto.nombre}"/></td>
                    <td><c:out value="${producto.precio}"/></td>
                    <td><c:out value="${producto.cantidad}"/></td>
                    <td><c:out value="${producto.categoria.nombre}"/></td>
                    <td><a href="<c:url value="/catalogo/form.htm?id=${producto.id}"/>">editar</a></td>
                    <td><a onclick="return confirm('Esta seguro?');" href="<c:url value="/catalogo/eliminar.htm?id=${producto.id}"/>">eliminar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>