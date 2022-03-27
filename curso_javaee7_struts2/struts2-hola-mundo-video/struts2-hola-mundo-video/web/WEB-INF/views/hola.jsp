<%-- 
    Document   : hola
    Created on : 18-nov-2015, 18:44:55
    Author     : Andres
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><s:property value="saludo" /></h1>
        <p>Hoy día es <s:property value="fecha" /></p>
    </body>
</html>
