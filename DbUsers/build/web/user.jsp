<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de users</title>
    </head>
    <body>
        <form action="UserController" method="post">
            <fieldset>
                <legend>Registro de users</legend>
                <div>
                    <label for="dbUserId">Id user</label>
                    <input type="text" name="dbUserId"
                           value="${user.dbUserId}"
                           placeholder="Id de users"
                           readonly="readonly" />
                </div>
                <div>
                    <label for="name">Nombre:</label>
                    <input type="text" name="name"
                           value="${user.name}"
                           placeholder="Nombre de usuario"
                           />
                </div>
                <div>
                  <label for="creationDate">Creation date</label>
                    <input type="text" name="creationDate"
                           value="${user.creationDate}"
                           placeholder="Fecha creacion"
                           />
                </div>
                <div>
                    <label for="modificationDate">Modification date</label>
                    <input type="text" name="modificationDate"
                           value="${user.modificationDate}"
                           placeholder="Fecha modificacion"
                           />
                </div> 
                           <div>
                    <label for="userName">User name</label>
                    <input type="text" name="userName"
                           value="${user.userName}"
                           placeholder="Nombre de usuario"
                           />
                </div> 
                 <div>
                     <input type="submit" value="Guardar" />
                 </div>           
            </fieldset>
        </form>
    </body>
</html>
