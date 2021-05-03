<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Producto</title>
    </head>
    <body>
       
        
        <div style="margin:30px">
            <form action="<%=request.getContextPath() + "/catalogo/add" %>" method="post">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input name="nombre" type="text" /></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td> <input name="precio" type="text" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                       <input type="submit" name="enviar" value="Crear" />
                    </td>
                </tr>
            </table>
            </form>           
           
        </div>
        
    </body>
 
</html>
