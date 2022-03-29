<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Detalle de Cuentas</title>
    </head>
    <body>
        <h1>Detalle de Cuentas</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>Nombre Cuenta</th>
                    <th>Tipo</th>
                    <th>Balance</th>
                    <th>Número Cuenta</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${cuentas}" var="cuenta">
                    <tr>
                        <td><c:out value="${cuenta.nombreCuenta}" /></td>
                        <td><c:out value="${cuenta.tipoCuenta}" /></td>
                        <td>$<c:out value="${cuenta.balance}" /></td>
                        <td><c:out value="${cuenta.numeroCuenta}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
