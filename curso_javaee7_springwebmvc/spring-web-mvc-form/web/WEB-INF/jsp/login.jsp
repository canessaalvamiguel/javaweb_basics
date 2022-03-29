<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${titulo}" /></title>
    </head>
    <body>
        <h1><c:out value="${titulo}" /></h1>

        <form:form method="post" commandName="cliente">
            <table bgcolor="f8f8ff" border="0" cellspacing="0"
                   cellpadding="5">
                <tr>
                    <td align="right" width="20%">ID Usuario:</td>
                    <td width="20%"><form:input path="usuarioId" /></td>
                    <td width="60%"><form:errors path="usuarioId" cssClass="error" /></td>
                </tr>
                <tr>
                    <td align="right" width="20%">Clave:</td>
                    <td width="20%"><form:password path="password" /></td>
                    <td width="60%"><form:errors path="password" cssClass="error" /></td>
                </tr>
            </table>
            <br />
            <p><input type="submit" value="Login"></p>
            </form:form>
    </body>
</html>
