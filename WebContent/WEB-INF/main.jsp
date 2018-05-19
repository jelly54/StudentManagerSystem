<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style1.css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<link href="css/style_1.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
</head>

<body overflow:auto;>
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
						<a href='#'>删除学生信息</a>
						 <a	href='#'>修改学生信息</a>
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<div class="right-nav"></div>
			<center>
				<div class="main">
					<!--表格结束-->
					<c:if test="${msg=='success'}">
						<font -size="4px" ; color=blue>&nbsp;&nbsp;&nbsp;<b>操作成功！</b></font>
					</c:if>
					<c:if test="${msg=='fail'}">
						<font -size="4px" ; color=blue>&nbsp;&nbsp;&nbsp;<b>对不起，操作失败，请重试！！</b></font>
					</c:if>
					<br>
					<table border='1' cellspacing="2" cellpadding="2">
						<tr>
							<th align="center" width="200">序号</th>
							<th align="center" width="200">ID</th>
							<th align="center" width="200">用户名</th>
							<th align="center" width="200">性别</th>
							<th align="center" width="200">生日</th>
							<th align="center" width="200">地址</th>
							<th align="center" width="200">电话</th>
							<th align="center" width="200">学院</th>
							<th align="center" width="200">班级</th>
							<th align="center" width="200">删除</th>
							<th align="center" width="200">修改</th>
						</tr>
						<c:forEach items="${users}" var="user" varStatus="status">
							<tr>
								<td>${status.index+1 }</td>
								<td>${user.id }</td>
								<td>${user.username }</td>
								<td>${user.sex }</td>
								<td><fmt:formatDate value="${user.birthday }"
										pattern="yyyy-MM-dd" /></td>
								<td>${user.address }</td>
								<td>${user.phone }</td>
								<td>${user.institute }</td>
								<td>${user.sclass }</td>
								<td><a href="delete.do?id=${user.id }">删 除</a></td>
								<td><a href="update.do?id=${user.id }">修改</a></td>
							</tr>
						</c:forEach>
						<tr>&nbsp;</tr><tr>&nbsp;</tr>
					<!-- 数据库分页， -->
						<tr>
							<td colspan="11">
            			<!-- 分页功能 start -->
          				  <div align="center">
          				     <font size="2">&nbsp;&nbsp;&nbsp;&nbsp;共有${page.itemCont}条记录，当前${page.pageCurrent}/${page.pageCont}页分页 &nbsp;&nbsp;&nbsp; </font>
							<c:choose>
								<c:when test="${page.pageCurrent==1 }">
									<a href="toMain.do?pageCurrent=${page.pageCurrent }">&nbsp;&nbsp;首页</a>
									<a href="toMain.do?pageCurrent=${page.pageCurrent }">&nbsp;&nbsp;上一页</a>
								</c:when>
								<c:otherwise>
									<a href="toMain.do?pageCurrent=1">&nbsp;&nbsp;首页</a>
									<a href="toMain.do?pageCurrent=${page.pageCurrent-1}">&nbsp;&nbsp;上一页</a>
								</c:otherwise>
							</c:choose> 
							<c:choose>
								<c:when test="${page.pageCurrent==page.pageCont }">
									<a href="toMain.do?pageCurrent=${page.pageCurrent }">&nbsp;&nbsp;下一页</a>
									<a href="toMain.do?pageCurrent=${page.pageCurrent }">&nbsp;&nbsp;尾页</a>
								</c:when>
								<c:otherwise>
									<a href="toMain.do?pageCurrent=${page.pageCurrent+1}">&nbsp;&nbsp;下一页</a>
									<a href="toMain.do?pageCurrent=${page.pageCont}">&nbsp;&nbsp;尾页</a>
								</c:otherwise>
							</c:choose>
							</div>
            				<!-- 分页功能 End -->
							</td>
						</tr>




					</table>
					<!--表格结束-->
				</div>
			</center>
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
