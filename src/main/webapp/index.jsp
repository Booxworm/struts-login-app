<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Group 61!</h1>
        <s:form action="login">
            <s:textfield name="username" label="Name" />
            <s:password name="password" label="Password" />
            <s:submit value="Login" />
        </s:form>
    </body>
</html>