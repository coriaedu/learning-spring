<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title from JSP</title>
</head>
<body>
My first JSP where name is ${name} and my password is ${password}

<form action="/login.do" method="post">
Enter your name <input type="text" name="name"/> <input type="submit" value="Login"/>
</form>
</body>
</html>