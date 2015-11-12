
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="background.jsp"%>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/createUser.css">
</head>
<body>

<form class="form-container" action="/user_create" method="post">
    <div class="form-title"><h2>Create new user</h2></div>

    <div class="form-title">First name</div>
    <input class="form-field" type="text" name="first_name" /><br />
    <div class="form-title">Last name</div>
    <input class="form-field" type="text" name="last_name" /><br />
    <div class="form-title">E-mail</div>
    <input class="form-field" type="text" name="email" /><br />
    <div class="form-title">Login</div>
    <input class="form-field" type="text" name="login" /><br />
    <div class="form-title">Password</div>
    <input class="form-field" type="password" name="password" /><br />
    <div class="form-title">Confirm password</div>
    <input class="form-field" type="password" name="confirm_password" /><br />
    <div class="form-title">Role</div>
    <select class="form-field" name="role">
        <option>Administrator</option>
        <option>Subscriber</option>
    </select>

    <div class="submit-container">
        <input class="submit-button" type="submit" actionType="add" value="Submit" />
        <input class="submit-button" type="submit" actionType="cancel" value="Cancel" />
    </div>
</form>

</body>
</html>
