<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Adobe</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #4A148C, #880E4F);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            background: white;
            padding: 50px;
            border-radius: 20px;
            text-align: center;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
            width: 400px;
            animation: fadeIn 1s ease-in-out;
        }
        h1 {
            color: #4A148C;
            margin-bottom: 30px;
            font-size: 28px;
        }
        a.signup-btn {
            display: inline-block;
            padding: 14px 28px;
            text-decoration: none;
            color: white;
            background: linear-gradient(90deg, #ff5722, #e91e63);
            font-size: 18px;
            font-weight: bold;
            border-radius: 30px;
            transition: 0.3s;
            box-shadow: 0px 5px 15px rgba(233,30,99,0.4);
        }
        a.signup-btn:hover {
            transform: scale(1.05);
            background: linear-gradient(90deg, #e91e63, #ff5722);
            box-shadow: 0px 8px 20px rgba(233,30,99,0.6);
        }
        @keyframes fadeIn {
            from {opacity: 0; transform: translateY(30px);}
            to {opacity: 1; transform: translateY(0);}
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to MTsolar</h1>
        <a href="signup" class="signup-btn">Sign Up</a>
    </div>
</body>
</html>
