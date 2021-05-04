<%@page contentType="text/html"%>

<jsp:useBean id="cuenta" class="com.formacionbdi.ejemplo.models.beans.Cuenta" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="cuenta" />

<%   
    String titulo = "Formulario Básico Servlet: Datos enviados";
    String titulo2 = "Detalle Cuenta: " + cuenta.getNombre();
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title><%=titulo%></title>
        <!-- Bootstrap -->
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>
                    <%=titulo%>
                </h1>
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading"><%=titulo2%></div>
                <div class="panel-body">
                    <table class="table table-striped table-hover table-bordered">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Email</th>
                                <th>Saldo</th>
                                <th>Endeudamiento</th>
                                <th>Fecha Renovación</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><%=cuenta.getNombre() %></td>
                                <td><%=cuenta.getEmail( )%></td>
                                <td><%=cuenta.getSaldo() %></td>
                                <td><%=cuenta.getNivelEndeudamiento() %></td>
                                <td><%=cuenta.getFechaRenovacion() %></td>
                            </tr>
                        </tbody>
                    </table>
                    <a class="btn btn-default" href="<%=request.getContextPath()%>/form.jsp" role="button">Volver</a>
                </div>
            </div>
        </div>
    </body>
</html>