<%-- 
    Document   : index
    Created on : 14-Apr-2020, 09:52:45
    Author     : Stephen Hardy @ spotpush.com
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <style><%@ include file="css/style.css"%></style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Management</title>
    </head>
    <body>
        <div>Select Action</div>
        <a href="<%=request.getContextPath()%>/AddNewUser">Create New User</a><br>
        <a href="<%=request.getContextPath()%>/">Delete User</a><br>
        <a href="<%=request.getContextPath()%>/">List Users</a><br>
    </body>
</html>
