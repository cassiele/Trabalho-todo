<%-- 
    Document   : rankingtop10jsp
    Created on : 02/07/2017, 17:29:07
    Author     : lucas
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Top 10</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
    <!--<link rel="stylesheet" href="/jsp/Votacao/assets/css/styles.css">-->               
    <!--<link rel="stylesheet" href="styles.css">-->   
    <link rel="StyleSheet" type="text/css" href="jsp/styles.css" media="screen" >
    <script src="https://code.jquery.com/jquery-2.2.3.js" integrity="sha256-laXWtGydpwqJ8JA+X9x2miwmaiKhn8tVmOVEigRNtP4=" crossorigin="anonymous"></script>

    <style type="text/css">
        .largura200px {
            width: 200px;
        }
    </style>
</head>

<html>
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

        <div class="list-group">      
            <div class="container">            
               <div class="row">
                   <h1>Ranking Top 10</h1>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><strong>Clique em uma categoria</strong></h3>
                        </div>
                        <div class="panel-body">
                            <c:forEach var="categoria" items="${categorias}">
                                <div class="col-md-2">
                                    <form action="Top10" method="post">
                                        <fieldset>
                                            <legend>Categoria</legend>
                                            <input class="largura200px" type="hidden" value="${categoria.id}" name="id">
                                            <input class="btn btn-primary" type="submit" value="${categoria.nome}" name="nome">
                                        </fieldset>
                                    </form>
                                </div>
                            </c:forEach>   
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>