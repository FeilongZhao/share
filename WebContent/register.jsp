<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" href="assets/css/regist.css">
</head>

<body>
	<div id="container">
		<div class="wrapper">
			<div class="logo">
				<a href="javascript:;"></a>
			</div>
			<form action="${pageContext.request.contextPath }/UserAction_register" method="post">
			<div class="signup-box">
				<div class="inner">
					<div class="hd">账号注册</div>
					<div class="form">
						<input class="name" type="text" placeholder="您的名号"name="user_code"> 
							<input class="pws" type="password"placeholder="您的密码">
							 <input class="name" type="text"placeholder="确认密码" name="user_password">
						<div class="phone-check">
							<a href="javascript:;" class="check-button">免费获取验证码</a> <input
								class="check-num" type="text" placeholder="短信验证码"
								name="user_phone">
						</div>
						<button type="submit">立即注册</button>
					</div>
					
				</div>
			</div>
			</form>
		</div>
	</div>
</body>

</html>