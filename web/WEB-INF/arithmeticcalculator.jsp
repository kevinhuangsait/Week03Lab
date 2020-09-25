<%-- 
    Document   : arithmetic
    Created on : Sep 25, 2020, 1:02:24 PM
    Author     : 831719
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
        First: <input type="text" name="value1" value="${value1}"><br>
        Second: <input type="text" name="value2" value="${value2}"><br>
        <input type ="submit" name="submit" value="+">
        <input type ="submit" name="submit" value="-">
        <input type ="submit" name="submit" value="*">
        <input type ="submit" name="submit" value="/">
        </form>
        
        <br>
        <br>
        <p>Result: ${message}</p>
        
    </body>
</html>
