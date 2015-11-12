
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<%@include file="background.jsp"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta content='5; url=pages/login.jsp' http-equiv='Refresh'/>
    <title></title>
    <style>
        body { background: url("images/background.jpg"); }
    </style>
</head>
<body>

    Authorization failed! ${message}

</body>
</html>
