<%-- 
    Document   : lista_users
    Created on : 29/09/2016, 01:26:50 PM
    Author     : raul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de users</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id User</th>
                    <th>Name</th>
                    <th>Creation date</th>
                    <th>Fechar fin</th>
                    <th>User name</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.dbUserId}</td>
                        <td>${user.name}</td>
                        <td>${user.creationDate}</td>
                        <td>${user.modificationDate}</td>
                        <td>${user.userName}</td>

                        <td>
                            <a href="UserController?action=cambiar&dbUserId=${user.dbUserId}">Cambiar</a>
                        </td>
                        <td>
                            <a href="UserController?action=borrar&dbUserId=${user.dbUserId}">Borrar</a>
                        </td>

                    </tr>
                </c:forEach>
            </tbody>    
        </table>

        <p>
            <a href="UserController?action=agregar">Agregar user</a>
        </p>
    </body>
</html>