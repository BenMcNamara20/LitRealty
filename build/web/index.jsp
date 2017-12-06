<%-- 
    Document   : index
    Created on : 23-Nov-2017, 10:49:42
    Author     : benmc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
        <c:when test="${sessionScope.username != NULL}">
            <img src="images/agents/${sessionScope.IDnum}.jpg"/>
            </br>
            <p>${sessionScope.username}</p>

            <a href="logoutServlet"> Log out </a>
            </br>
            <a href="PropertyOptions.jsp">Property Options</a>
        </c:when>
        <c:otherwise>
            <form action="servletLogin" name="loginform">
            <input type="text" name="Username" value="" />
            <input type="text" name="Password" value="" />
            <input type="submit" value="Log in" name="LogIn" />
        </form>
        </c:otherwise>
        </c:choose>
        
        
        
        
        

        
    </body>
</html>
