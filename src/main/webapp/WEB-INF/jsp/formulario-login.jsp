<%-- 
    Document   : formulario-login
    Created on : 09/06/2017, 22:09:08
    Author     : helio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="efetuaLogin" method="post">
            Login: <input type="text" name="nome" /> <br /> 
            Senha: <input type="password" name="senha" /> <br />
            <input type="submit" value="Entrar nas tarefas" /> 
        </form>
    </body>
</html>
