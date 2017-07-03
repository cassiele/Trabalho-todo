<%-- 
    Document   : lista
    Created on : 26/05/2017, 22:19:21
    Author     : Lucas
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ranking de ${CategoriaNome}</title>
    <script src="https://code.jquery.com/jquery-2.2.3.js" integrity="sha256-laXWtGydpwqJ8JA+X9x2miwmaiKhn8tVmOVEigRNtP4=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css"> 
    <link rel="StyleSheet" type="text/css" href="jsp/styles.css" media="screen" >
</head>

<boby>
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
            <div class="container">            
                <div class="row">
                    <div class="col-md-6">
                    <h1>Ranking de ${CategoriaNome}</h1>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered">
                            <caption><strong>Top 10</strong></caption>
                            <thead>
                                <tr>
                                    <th>RANKEAVEL</th>
                                    <th>VOTOS</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="ranking" items="${ranking}">    
                                    <tr>
                                        <td>${ranking.rank}</td> 
                                        <td>${ranking.voto}</td> 
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>        
            
            
<!--    <h1>Ranking de ${CategoriaNome}</h1>
    <table  border="1" margin="2">
        <tr>
            <th>Rankeavel</th>
            <th>Votos</th>
        </tr>

        <c:forEach var="ranking" items="${ranking}">
            <tr>
                <td>${ranking.rank}</td> 
                <td>${ranking.voto}</td> 
            </tr>
        </c:forEach>
    </table>        -->
    
</boby>

