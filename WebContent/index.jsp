<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>学生信息管理系统</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="css/style_1.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript">
	function showLogin(){
		document.getElementById('defaultPage').style.display="none";
		document.getElementById('loginPage').style.display="";
	}
	function resetInfo(){
		document.getElementById('loginPage').reset();
		document.getElementById('defaultPage').style.display="";
		document.getElementById('loginPage').style.display="none";
	}
	function submitInfo(){
  		document.getElementById('loginPage').submit();
	}
</script>
</head>
<body>	
	<!--top-header-->
	<div id="home" class="top-header">
	 	<div class="container">
		 	<div class="logo">
				<h1><a onclick="showLogin()">管理</a></h1>
		 	</div>
	 	</div>
	</div>	
	<!--header-->
	<div class="header">
		<div class="container">
			 <div class="banner-info">
				 <h2>学生信息管理系统</h2>
				 <div id="defaultPage">
				 	<p id="str1" style="font-size:15px;font-family:微软雅黑">采用当前最流行框架技术整合</p>
				 	<p id="str1" style="font-size:15px;font-family:微软雅黑">学生信息，平台式掌握</p>
					<p id="str1" style="font-size:15px;font-family:微软雅黑">高效、精准、易管理</p>
					<p id="str1" style="font-size:15px;font-family:微软雅黑">如需管理学生信息，请点击管理按钮</p>
				 </div>
				 <form id="loginPage" method="post" action="check.do" style="display:none">
				 	<p>账号：</p><input name="mName" type="text" size=37>
				 	<br>
				  	<p>密码：</p><input name="mPass" type="password" size=37>
				 	<br>
				  	<a onclick="submitInfo()">登录</a>
				  	<a style="margin-left:10px" onclick="resetInfo()">取消</a>
				  </form>
			 </div>
		</div>
	</div>
</body>
</html>		
	