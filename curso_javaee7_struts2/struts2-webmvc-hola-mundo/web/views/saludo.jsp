<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Saludo Struts2</title>
    </head>
    <body>
        <h1><s:property value="saludo" /></h1>
        <p>Hoy día es <s:date name="fecha" format="d 'de' MMMM 'de' yyyy" /></p>

    </body>
</html>
