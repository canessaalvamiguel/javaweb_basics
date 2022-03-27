<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Login</title>
    </head>
    <body>
        <h1>Formulario Login</h1>

        <s:form method="post" action="login">
            <s:textfield label="ID Usuario" name="cliente.usuarioId" />
            <s:password label="Clave" name="cliente.password" />
            <s:submit type="submit" value="Login" />
        </s:form>
    </body>
</html>
