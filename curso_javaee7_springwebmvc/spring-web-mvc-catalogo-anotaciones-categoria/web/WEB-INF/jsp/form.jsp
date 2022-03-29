<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${titulo}" /></title>
    </head>
    <body>
        <h3><c:out value="${titulo}" /></h3>

        <p><a href="<c:url value="/catalogo/listado.htm"/>">volver</a></p>
        <form:form method="post" commandName="producto">
            <table border="0" cellpadding="2" cellspacing="3">
                <tbody>
                    <tr>
                        <td>Categorias</td>
                        <td>
                            <form:select path="categoria">
                                <form:option value="0" label="seleccione una categoría -->" />
                                <form:options items="${categorias}" itemLabel="nombre" itemValue="id" />
                            </form:select>
                        </td>
                        <td><form:errors path="categoria" /></td>
                    </tr>
                    <tr>
                        <td><span>Nombre</span></td>
                        <td><form:input path="nombre" size="30" /></td>
                        <td><form:errors path="nombre" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td><span>Cantidad</span></td>
                        <td><form:input path="cantidad"/></td>
                        <td><form:errors path="cantidad" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td><span>Precio</span></td>
                        <td><form:input path="precio"/></td>
                        <td><form:errors path="precio" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td colspan="3"><input type="submit" name="guardar" value="Guardar"/></td>
                    </tr>
                </tbody>
            </table>
        </form:form>
    </body>
</html>