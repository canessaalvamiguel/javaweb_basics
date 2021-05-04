<%-- 
    Document   : miPropiaPaginaError
    Created on : May 4, 2021, 1:43:17 AM
    Author     : Zod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%@ page isErrorPage="true" %>
       <h1> Esta es mi propia página de error y el mensaje de excepción <%= exception.getMessage()%>.</h1>
    </body>
</html>
