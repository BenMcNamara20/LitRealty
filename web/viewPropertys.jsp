<%-- 
    Document   : viewPropertys
    Created on : 04-Dec-2017, 12:18:22
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
        <p>
            <c:forEach items="${PropertyList}" var="items">
                ${items}
            </c:forEach>
        </p>
    </body>
</html>
