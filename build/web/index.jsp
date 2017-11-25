<%-- 
    Document   : index
    Created on : 23-Nov-2017, 10:49:42
    Author     : benmc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="servletLogin">
            <input type="text" name="Username" value="" />
            <input type="text" name="Password" value="" />
            <input type="submit" value="Log in" name="LogIn" />
        </form>
        
        <p>${sessionScope.username}</p>
    </body>
</html>
