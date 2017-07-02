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
    <title>JSP Page</title>
    <script src="https://code.jquery.com/jquery-2.2.3.js" integrity="sha256-laXWtGydpwqJ8JA+X9x2miwmaiKhn8tVmOVEigRNtP4=" crossorigin="anonymous"></script>

</head>
<html>
    <body>
        <div class="list-group">      
            <c:forEach var="categoria" items="${categorias}">
                <form action="Top10" method="post">
                    <input type="hidden" value="${categoria.id}" name="id">
                    <input type="submit" value="${categoria.nome}" name="nome">
                </form>
            </c:forEach>   
            
        </div>
    </body>
</html>