<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%	
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+(request.getServerPort() == 80 ? "": ":"+ request.getServerPort())+path; 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery.js"></script>
<title>用户列表</title>
<style type="text/css">
table {
	border-collapse: collapse;
	border: none;
}
th, td {
	border: 1px solid #999;
}
.userId {
	width: 100px;
}
.userName {
	width: 150px;
}
.userAge {
	width: 200px;
}
</style>
</head>
<body>
<h1>用户管理</h1>
<table>
	<thead>
		<tr>
			<th class="userId">用户ID</th>
			<th class="userName">姓名</th>
			<th class="userAge">年龄</th>
			<th>操作</th>
		</tr>
	</thead>
	<s:iterator value="users" var="user">
	<tr>
		<td>${user.userId}</td>
		<td>${user.name}</td>
		<td>${user.age}</td>
		<td><a href="<%=basePath%>/test/updateUser?userId=${user.userId}">修改</a>&nbsp;<a href="<%=basePath%>/test/delete?userId=${user.userId}">删除</a></td>
	</tr>
	</s:iterator>
</table>

<br />
<br />

<a href="<%=basePath%>/test/createUser">创建用户</a>

<%
if (request.getParameter("message") != null) {
%>
<script type="text/javascript">
alert("${message}");
</script>
<%
}
%>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
