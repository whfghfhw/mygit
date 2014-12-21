<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()
			+ "://"
			+ request.getServerName()
			+ (request.getServerPort() == 80 ? "" : ":"
					+ request.getServerPort()) + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery.js"></script>
<title>用户列表</title>
</head>
<body>
	<h1>${message}</h1>

	<%
		String actionUrl = basePath + "/test/create";
		if (!"创建用户".equals(request.getAttribute("message"))) {
			actionUrl = basePath + "/test/update";
		}
	%>

	<form action="<%=actionUrl%>" method="post">
		<label>用户ID*：<input name="userId" type="text"
			value="${userId}" /></label><br /> <label>用户名*：<input name="name"
			type="text" value="${name}" /></label><br /> <label>密 码*：<input
			name="password" type="password" value="${password}" /></label><br /> <label>年
			龄*：<input name="age" type="age" value="${age}" />
		</label><br /> <input type="submit" value="确定" /> <input type="reset"
			value="重置" />
	</form>
</body>
</html>
