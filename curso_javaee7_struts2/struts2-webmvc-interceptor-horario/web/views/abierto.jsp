<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="mensaje" /></title>
    </head>
    <body>
        <h1><s:property value="mensaje" /></h1>
        <p><s:property value="horario" /></p>
    </body>
</html>
