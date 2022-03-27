<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error en el Login</title>
    </head>
    <body>
        <h1>Error en el Login</h1>
        <s:actionerror cssStyle="color:red;font-weight: bold;"/>
        <p><a href="<s:url action="form" />" title="volver al login">volver al login</a></p>
    </body>
</html>
