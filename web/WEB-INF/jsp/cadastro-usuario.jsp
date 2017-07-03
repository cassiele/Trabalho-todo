<%-- 
    Document   : cadastro-usuario
    Created on : 03/07/2017, 01:55:04
    Author     : edgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro usuario</title>
    </head>
    <body>
        <h2>Página de cadastro </h2>
        <form action="cadastroUsuario" method="post">
        Nome do Usuario <input type="text" name="nome" /> <br /> 
        Senha: <input type="password" name="senha" /> <br />
        Perfil: <input type="text" name="perfil"/> <br />
        <input type="submit" value="Efetuar Cadastro" />
        </form>
    </body>
</html>
