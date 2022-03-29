<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Fuera del Horario de Atención</title>
    </head>
    <body>
        <h1>Fuera del Horario de Atención</h1>
        <p>Por favor visítenos desde las <span style="color:red; font-weight: bold"><%=request.getParameter("apertura")%></span> y <span style="color:red; font-weight: bold"><%=request.getParameter("cierre")%> hrs</span>. Gracias!</p>
    </body>
</html>
