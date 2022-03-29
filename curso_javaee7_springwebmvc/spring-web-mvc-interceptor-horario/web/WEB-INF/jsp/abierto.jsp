<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${mensaje}" /></title>
    </head>
    <body>
        <h1><c:out value="${mensaje}" /></h1>
        <p><c:out value="${horario}" /></p>
    </body>
</html>
