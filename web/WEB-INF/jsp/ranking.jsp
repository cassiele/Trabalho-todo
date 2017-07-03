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

</head>
<boby>
    <h1>Ranking de ${CategoriaNome}</h1>
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
    </table>        
</boby>

