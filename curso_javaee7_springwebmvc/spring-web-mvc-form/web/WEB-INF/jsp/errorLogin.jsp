<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Error en el Login</title>
    </head>
    <body>
        <h1>Error en el Login</h1>
        <p style="color:red;font-weight: bold;"><c:out value="${error}" /></p>
        <p><a href="<c:url value="login.htm" />" title="volver al login">volver al login</a></p>
    </body>
</html>
