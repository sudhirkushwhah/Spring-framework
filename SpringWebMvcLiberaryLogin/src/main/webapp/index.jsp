<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Login</title>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 10;
	background: linear-gradient(135deg, #6a11cb, #2575fc);
	font-family: Arial, sans-serif;
}

.btn-container {
	text-align: center;
}

.login-btn {
	display: inline-block;
	padding: 15px 40px;
	background-color: #4CAF50;
	color: purple;
	text-decoration: none;
	font-size: 18px;
	font-weight: bold;
	border-radius: 12px;
	transition: all 0.3s ease;
	box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2);
}

.login-btn:hover {
	background-color: #45a049;
	transform: scale(1.1);
	box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<div class="btn-container">
		<!-- Anchor tag styled as a button -->
		<a href="login" class="login-btn">Library Login</a>
	</div>
</body>
</html>