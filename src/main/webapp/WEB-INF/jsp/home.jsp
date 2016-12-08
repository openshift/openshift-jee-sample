<%-- 
    Document   : home
    Created on : Dec 7, 2016, 9:25:53 AM
    Author     : Suroj
--%>

<%@page import="java.util.List"%>
<%@page import="com.test.entity.TblContact"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello !!! ${param.msg}!</h1>
        <%
            List<TblContact> list = (List<TblContact>) session.getAttribute("data");
            for (TblContact c : list) {
        %>
    <tr>
        <td>${c.getName()}</td>
        <td>${c.getAddress()}</td>
    </tr>
    <%
        }
    %>
</body>
</html>
