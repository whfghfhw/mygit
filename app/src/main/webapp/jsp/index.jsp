<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery.js"></script>
	<title>用户主页</title>
</head>
<body>
	<h1>Hello World!</h1>
	<a href="../test/fetchUsers">查询用户</a><br />
	<a href="../test/createUser">创建用户</a><br />
</body>
</html>
