<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Kodewala Academy - Registration Successful</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(135deg, #00b09b, #96c93d);
	margin: 0;
	padding: 0;
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	background: #ffffffdd;
	padding: 50px;
	border-radius: 20px;
	box-shadow: 0px 8px 25px rgba(0, 0, 0, 0.3);
	text-align: center;
	width: 450px;
}

h1 {
	color: #2e7d32;
	margin-bottom: 20px;
}

p {
	color: #444;
	font-size: 18px;
	margin-bottom: 25px;
}

.btn {
	display: inline-block;
	padding: 12px 35px;
	background: linear-gradient(90deg, #ff512f, #dd2476);
	color: white;
	font-size: 16px;
	font-weight: bold;
	text-decoration: none;
	border-radius: 50px;
	transition: all 0.3s ease;
	box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.2);
}

.btn:hover {
	background: linear-gradient(90deg, #dd2476, #ff512f);
	transform: scale(1.08);
	box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<div class="container">
		<h1>🎉 Registration Successful 🎉</h1>
		<p>
			Welcome to <strong>Kodewala Academy</strong>!<br> Your
			registration has been completed successfully.
		</p>

		<p>
			<strong>Your User ID:</strong> ${user.userId}
		</p>




	</div>
</body>
</html>
