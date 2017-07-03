
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rankeable | Votação</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
        <link rel="stylesheet" href="/Votacao/assets/css/styles.css">       
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header"><a class="navbar-brand navbar-link" href="#">Rankeables </a>
                    <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                </div>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active" role="presentation"><a href="RankingList">Top 10</a></li>
                        <li role="presentation"><a href="logout">Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h2 class="text-left">${nome_rankeavel}</h2>
                </div>
                <div class="col-md-9"><img class="img-thumbnail" src="${foto}" width="400px" height="500px"></div>
                <div class="col-md-2" style="padding:0px;margin:0px;">
                    
                    <div class="list-group">
                        <c:forEach var="categoria" items="${categorias}">
                                <a class="list-group-item" href="insereVoto?id=${categoria.id}">
                                <span>${categoria.id} - <span>${categoria.nome}</span>
                            </a>
                        </c:forEach>             
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="row">
                        <div class="col-md-9">
                            <div class="btn-toolbar">
                                <div class="btn-group" role="group">
                                    <a class="btn btn-default" role="button" href="getBack">Anterior</a>
                                    <a class="btn btn-default" role="button" href="getRandom">Proximo</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                </div>
            </div>
        </div>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>  
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    </body>
</html>


