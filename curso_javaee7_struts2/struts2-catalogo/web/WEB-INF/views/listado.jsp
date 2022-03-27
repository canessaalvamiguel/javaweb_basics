<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title><s:property value="titulo" />
        </title>
    </head>
    <body>
        <h3>
            <s:property value="titulo" />
        </h3>

        <s:url id="crearUrl" action="form" />

        <p><a href="<s:property value="crearUrl" />" >crear producto</a></p>

        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </tr>
            <s:iterator value="productos">
                <tr>
                    <td><s:property value="id" />
                    </td>
                    <td><s:property value="nombre" />
                    </td>
                    <td><s:property value="precio" />
                    </td>
                    <td><s:property value="cantidad" />
                    </td>
                    <td>

                        <s:url id="editarUrl" action="form">
                            <s:param name="id" value="id"></s:param>
                        </s:url>

                        <a href="<s:property value="editarUrl" />">
                            editar
                        </a>

                    </td>
                    <s:url id="eliminarUrl" action="eliminar">
                        <s:param name="producto.id" value="id"></s:param>
                    </s:url>

                    <td><a onclick="return confirm('esta seguro que decea eliminar <s:property value="nombre" />?');" href='<s:property value="eliminarUrl"/>'>eliminar</a></td>
                <tr>
                </s:iterator>
        </table>

    </body>
</html>