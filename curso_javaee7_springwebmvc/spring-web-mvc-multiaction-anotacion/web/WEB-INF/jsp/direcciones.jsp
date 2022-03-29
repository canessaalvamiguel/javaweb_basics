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
        <p style="margin: 30px 0"><a href="<c:url value="perfil.htm" />" title="volver a perfil">volver</a></p>
        <table border="1">
            <thead>
                <tr>
                    <th>Pais</th>
                    <th>Ciudad</th>
                    <th>Sector/Comuna</th>
                    <th>Calle</th>
                    <th>Número #</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${direcciones}" var="direccion">
                    <tr>
                        <td><c:out value="${direccion.pais}" /></td>
                        <td><c:out value="${direccion.ciudad}" /></td>
                        <td><c:out value="${direccion.sector}" /></td>
                        <td><c:out value="${direccion.calle}" /></td>
                        <td><c:out value="${direccion.numero}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
