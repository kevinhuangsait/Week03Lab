<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2020, 11:34:03 AM
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
        <h1>Age Calculator</h1>
        <form action="agecalculator" method="post">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="button" name="agebutton">
            <input type ="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            <p>${message2}</p>
    </body>
</html>
