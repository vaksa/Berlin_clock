
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="background.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <img src="images/avatar.png">
    <%--<a href="pages/login.jsp"><div class="imgAvatar" ><img src="images/avatar.png" /></div>--%>
    <p><a href="/user_view"> Hello ${user}! </a></p>
    <p><a href="/user_list"> Users manager </a></p>
</body>
</html>
