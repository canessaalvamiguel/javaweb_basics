<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo" /></title>
    </head>
    <body>
        <h3><s:property value="titulo" /></h3>
        
        <s:url id="listadoUrl" action="listado" />

        <p><a href="<s:property value="listadoUrl" />" >volver</a></p>
        
        <s:form method="post" action="guardar">
            <s:hidden name="producto.id" value="%{producto.id}" />
            <s:textfield name="producto.nombre" label="Nombre" value="%{producto.nombre}" />
            <s:textfield name="producto.precio" label="Precio" value='%{producto.precio==0?"": producto.precio}'/>
            <s:textfield name="producto.cantidad" label="Cantidad" value='%{producto.cantidad==0?"":producto.cantidad}'/>
            
            <s:submit name="boton" value="%{titulo}" />
            
        </s:form>
    </body>
</html>
