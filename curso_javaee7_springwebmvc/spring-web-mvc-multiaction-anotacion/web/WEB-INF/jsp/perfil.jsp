<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${titulo}" /></title>
    </head>
    <body>
        <h1><c:out value="${titulo}" /></h1>
        <p>Nombre: <c:out value="${usuario.nombre}" /></p>
        <p>Apellido: <c:out value="${usuario.apellido}" /></p>
        <p>Edad: <c:out value="${usuario.edad}" /></p>
        <p>Altura: <c:out value="${usuario.altura}" /></p>
        <p><a href="<c:url value="direcciones.htm" />" title="ver direcciones">ver direcciones</a></p>
    </body>
</html>
