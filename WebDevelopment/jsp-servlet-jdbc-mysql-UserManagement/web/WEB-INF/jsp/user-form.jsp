<%-- 
    Document   : user-form
    Created on : 12-Apr-2020, 18:27:11
    Author     : Stephen Hardy @ spotpush.com
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <style><%@ include file="../../css/style.css"%></style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Management Application</title>
    </head>
    <body>
        <form action="insert" method="post">
            <fieldset>
                <legend>Add New User</legend>
                <br>
                <fieldset>
                    <legend>User Details</legend>
                    <input type="hidden" name="id" value="<c:out value='${user.id}'/>"><br>
                    <label>User Name:</label><br><input type="text" name="name" required="required" value="<c:out value='${user.name}'/>"><br>
                    <label>Email Address:</label><br><input type="text" name="email" value="<c:out value='${user.email}'/>"><br>
                    <label>Country:</label><br><input type="text" name="country" value="<c:out value='${user.country}'/>"><br><br>
                </fieldset>
                <br>
                    <fieldset>
                        <legend>Submit Details</legend>
                            <button type="submit">Add User</button>
                            <button type="reset">Clear Form</button>
                    </fieldset>
                <br>
                </fieldset>
        </form>
    </body>
</html>
