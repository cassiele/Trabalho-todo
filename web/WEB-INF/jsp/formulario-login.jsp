<%-- 
    Document   : formulario-login
    Created on : 15/06/2017, 15:30:20
    Author     : cassi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <script src="https://code.jquery.com/jquery-2.2.3.js" integrity="sha256-laXWtGydpwqJ8JA+X9x2miwmaiKhn8tVmOVEigRNtP4=" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css"> 
        <link rel="StyleSheet" type="text/css" href="jsp/styles.css" media="screen" >
    
        <style type="text/css">
            .largur300px {
                width: 300px;
            }
            
            .topo {
                margin-top: 10px;
            }
        </style>
    </head>

<body>
    <div class="container">
        <div class="row">
            <div class="jumbotron topo">
                <h1>Rankeables</h1>
                <p>Rankeamento de usuários do Facebook por categorias</p>
            </div>
        </div>
    </div>
    
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <form action="efetuaLogin" method="post">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><strong>Autenticação de Usuário</strong></h3>
                        </div>
                        <div class="panel-body">
                            <fieldset>
                                <legend>Nome</legend>
                                <input class="largura300px" type="text" name="nome" />
                            </fieldset>
                            <hr>
                            <fieldset>
                                <legend>Senha</legend>
                                <input class="largura300px" type="password" name="senha" />
                            </fieldset>
                        </div>
                        <div class="panel-footer">
                            <input class="btn btn-primary" type="submit" value="Acessar" />                            
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
                    
<!--      Login: <input type="text" name="nome" /> <br /> 
      Senha: <input type="password" name="senha" /> <br />-->
      <!--<input type="submit" value="Efetuar Login" />--> 
    <!--</form>-->
  </body>
</html>