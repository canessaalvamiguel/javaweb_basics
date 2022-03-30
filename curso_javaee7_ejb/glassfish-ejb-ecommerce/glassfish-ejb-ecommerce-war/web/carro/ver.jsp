<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title><c:out value="${titulo}" /></title>
    </head>
    <body>
        <h3><c:out value="${titulo}" /></h3>

        <c:choose>
            <c:when test="${carro.size > 0}">
                <form name="formcarro" action="actualizar.do" method="post">
                    <table cellspacing="0" cellpadding="0" border="0" style="width: 50%">
                        <thead>
                            <tr>
                                <th>Producto</th>
                                <th>Cantidad</th>
                                <th>Precio</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${carro.items}" var="item">
                                <tr>
                                    <td><c:out value="${item.nombre}" /></td>
                                    <td><input type="text" maxlength="4" size="4" name="cant_<c:out value="${item.id}" />" value="<c:out value="${item.cantidad}" />" /></td>
                                    <td><strong><c:out value="${item.basePrecio}" /></strong></td>
                                    <td><strong><c:out value="${item.importe}" /></strong></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="5" style="text-align: right;"><strong>Total: <c:out value="${carro.totalPrecio}" /></strong></td>
                            </tr>
                        </tbody>
                    </table>
                    <p>
                        <a href="<c:url value="/listado.do"/>">Continuar comprando</a>
                    </p>
                </form>
            </c:when>
            <c:otherwise>
                <p>No hay item en el carro</p>
                <p><a href="<c:url value="/listado.do"/>">Continuar comprando</a></p>
            </c:otherwise>
        </c:choose>
    </body>
</html>