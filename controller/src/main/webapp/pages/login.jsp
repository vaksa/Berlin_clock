<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page errorPage="loginError.jsp"%>

<%@include file="background.jsp"%>

<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>

<form class="form-container" action="/user_validator" method="post">
    <div class="form-title"><h2>Sign In</h2></div>
    <div class="form-title">Login</div>
    <input class="form-field" type="text" name="login" /><br />
    <div class="form-title">Password</div>
    <input class="form-field" type="password" name="password" /><br />
    <div class="submit-container">
        <input class="submit-button" type="submit" login="enter" value="Submit" />
    </div>
</form>

<%--<p><a href="/user_validator"> Goto work flow </a></p>--%>

</body>
</html>
