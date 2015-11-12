<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="background.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/userList.css">
</head>
<body>


<div class="form-title"><h2>Database users</h2></div>

<table class="form-table" border="1" >
    <tr class="tr">
        <th class="table-h">First name</th>
        <th class="table-h">Last Name</th>
        <th class="table-h">Email</th>
        <th class="table-h">Login</th>
        <th class="table-h">Password</th>
        <th class="table-h">Role</th>
        <th class="table-h">Actions</th>
    </tr>
    <c:forEach items="${databaseUsers}" var="user" varStatus="status">
        <%--<tr valign="top">--%>
        <tr class="tr">
            <td class="table-r">${user.firstName}</td>
            <td class="table-r">${user.lastName}</td>
            <td class="table-r">${user.email}</td>
            <td class="table-r">${user.login}</td>
            <td class="table-r">${user.password}</td>
            <td class="table-r">${user.role}</td>
            <td class="table-r">
                <a href="${pageContext.servletContext.contextPath}/user_view">View user</a>
                <a href="${pageContext.servletContext.contextPath}/user_edit">Edit user</a>
                <a href="${pageContext.servletContext.contextPath}/user_delete">Delete user</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
