<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${msg=='fail'}">
		<font -size="4px" ; color=blue>&nbsp;&nbsp;&nbsp;<b>对不起，操作失败，请重试！！</b></font>
	</c:if>

	<form action="updateManager.do" method="post">
	<h3>
		用户名：<input type="text" name="mName" value="${manager.mName }"/><br>
		密码：<input type="text" name="mPass" value="${ manager.mPass}"/><br>
		权限：<input type="text" name="mAuthority" value="${manager.mAuthority}" readOnly="true"><br>
		<input type="submit" value="submit">
	</h3>
	</form>
</body>
</html>