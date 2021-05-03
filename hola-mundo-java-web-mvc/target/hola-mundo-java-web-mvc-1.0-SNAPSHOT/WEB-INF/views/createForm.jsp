<%-- 
    Document   : createForm
    Created on : Apr 30, 2021, 3:32:15 AM
    Author     : Zod
--%>

<%
    String titulo = (String) request.getAttribute("titulo");
    String titulo2 = (String) request.getAttribute("titulo2");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Parametro 1: <%=titulo%></h1>
        <h1>Parametro 2: <%=titulo2%></h1>
    </body>
</html>
