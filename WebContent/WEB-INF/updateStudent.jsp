<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style1.css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<link href="css/style_1.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript">
	function submitInfo() {
		document.getElementById('loginPage').submit();
	}
</script>
</head>

<body>
	<div class="top"></div>
	<div id="header">
		<div class="logo">学生管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="updateMan.do?mName=${sessionScope.mName}">${sessionScope.mName}</a></li>
				<li><a href="updateMan.do?mName=${sessionScope.mName}">修改密码</a></li>
				<li><a href="updateMan.do?mName=${sessionScope.mName}">设置</a></li>
				<li><a href="outLogin.do">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>学生管理
					</h4>
					<div class="list-item none">
						<a href='addStudent.jsp'>增加学生信息</a> 
						<a href='toMain.do?pageCurrent=1'>删除学生信息</a>
						<a href='toMain.do?pageCurrent=1'>修改学生信息</a>
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<center>
				<div class="main">
					<br>
					<br>
					<form action="doUpdate.do?id=${user.id }" method="post" id="loginPage">
						<p>学生姓名</p>
						<input type="text" value="${user.username }" name="username">
						<p>性别</p>
						<input type="text" value="${user.sex }" name="sex">
						<p>生日</p>
						
						<c:choose>
							<c:when test="${user.birthday!=''}">
							<input type="text" value="<fmt:formatDate value='${user.birthday }' pattern='yyyy-MM-dd'/>" name="sbirthday">
							</c:when>
							<c:otherwise>
							<input type="text" placeholder="例：2001-01-01" name="sbirthday">
							</c:otherwise>
						</c:choose>
						
						<p>家庭住址</p>
						<input type="text" value="${user.address }" name="address">
						<p>联系电话</p>
						<input type="text" value="${user.phone }" name="phone">
						<p>所在院系</p>
						<input type="text" value="${user.institute }" name="institute">
						<p>班级</p>
						<input type="text" value="${user.sclass }" name="sclass"> <br> <a
							onclick="submitInfo()">修改</a>
					</form>
			</center>
		</div>
	</div>

	</div>
	<div class="bottom"></div>
	<div id="footer">
		<p>
			Copyright© <a href="http://haina365.com.cn/" target="_blank">天海广纳</a>
		</p>
	</div>
	<script>navList(12);</script>
</body>
</html>
