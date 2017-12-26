<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userInfo</title>
</head>
<body>
     姓名： ${userInfo.uname}
 <a href="/jcServer/user/showInfos">search</a>
 <a href="/jcServer/user/insertUser">insert</a>
 <a href="/jcServer/user/updateById">update</a>
 <a href="/jcServer/user/deleteById">delete</a>
</body>
</html>