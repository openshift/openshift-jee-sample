<%-- 
    Document   : login
    Created on : Dec 7, 2016, 9:09:41 AM
    Author     : Suroj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="loginAction" method="POST">
            <input type="text" name="username" value="" />    
            <input type="password" name="password" value="" />    
            <input type="submit" name="BTN" value="Login" />    
        </form>
        <label>${param.error}</label>
    </body>
</html>
