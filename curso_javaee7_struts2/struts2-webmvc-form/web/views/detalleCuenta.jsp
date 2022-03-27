<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                <s:iterator value="cuentas">
                    <tr>
                        <td><s:property value="nombreCuenta" /></td>
                        <td><s:property value="tipoCuenta" /></td>
                        <td><s:property value="balance" /></td>
                        <td><s:property value="numeroCuenta" /></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </body>
</html>
