<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Kodewala Academy - Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #4facfe, #00f2fe);
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            background: #ffffffdd;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0px 8px 25px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 350px;
        }
        h2 {
            color: #333;
            margin-bottom: 30px;
        }
        .login-btn {
            display: inline-block;
            padding: 14px 40px;
            background: linear-gradient(90deg, #ff6a00, #ee0979);
            color: white;
            font-size: 18px;
            font-weight: bold;
            text-decoration: none;
            border-radius: 50px;
            transition: all 0.3s ease;
            box-shadow: 0px 6px 15px rgba(0,0,0,0.2);
        }
        .login-btn:hover {
            background: linear-gradient(90deg, #ee0979, #ff6a00);
            transform: scale(1.08);
            box-shadow: 0px 10px 20px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Welcome to Kodewala Academy</h2>
        <a href="login" class="login-btn">Login</a>
    </div>
</body>
</html>
