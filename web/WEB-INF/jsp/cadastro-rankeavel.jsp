<%-- 
    Document   : cadastro-rankeavel
    Created on : 03/07/2017, 00:10:17
    Author     : edgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Rankeavel</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
        <!--<link rel="stylesheet" href="/jsp/Votacao/assets/css/styles.css">-->               
        <!--<link rel="stylesheet" href="styles.css">-->   
        <link rel="StyleSheet" type="text/css" href="jsp/styles.css" media="screen" >
        
        <style type="text/css">
            .input500px {
                width: 500px;
            }
        </style>

    </head>
    
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header"><a class="navbar-brand navbar-link" href="telaVotacao">Rankeables </a>
                    <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                </div>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li role="presentation"><a href="telaVotacao">Home</a></li>
                        <li role="presentation"><a href="rankeavelform">+1 Rankeavel</a></li>                        
                        <li role="presentation"><a href="RankingList">TOP 10</a></li>
                        <li role="presentation"><a href="logout">Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <form action="cadastroRankeavel" method="post">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><strong>Adiciona +1 Rankeavel</strong></h3></div>
                                <div class="panel-body">
                                    <fieldset>
                                        <legend>Nome</legend>
                                        <input class="input500px" type="text" name="nome" />
                                    </fieldset>
                                    <hr>
                                    <fieldset>
                                        <legend>URL Facebook</legend>
                                        <input class="input500px" type="text" name="urlRedeSocial" />
                                    </fieldset>
                                    <hr>
                                    <fieldset>
                                        <legend>URL Foto</legend>
                                        <input class="input500px" type="text" name="foto" />
                                    </fieldset>
                                </div>
                                <div class="panel-footer">
                                    <input class="btn btn-primary" type="submit" value="Adicionar" />                            
                                </div>
                            </div>
                        </form>                                        
                    </div>
                </div>
                <!--<h2>Página de cadastro </h2>-->
                <!--<form action="cadastroRankeavel" method="post">-->
                    <!--Nome do Rankeavel: <input type="text" name="nome" /> <br />--> 
                    <!--Url do Facebook: <input type="text" name="urlRedeSocial" /> <br />-->
                    <!--Foto: <input type="text" name="foto"/> <br />-->
                    <!--<input type="submit" value="Efetuar Cadastro" />-->
                <!--</form>-->
            </div>
        </div>
        
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>  
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>         
    </body>
</html>
</html>

