<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Confirmation - MTSolar</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #ff9966, #ff5e62);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 40px;
            border-radius: 18px;
            width: 420px;
            text-align: center;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.25);
            animation: zoomIn 0.8s ease;
        }
        .icon {
            font-size: 60px;
            color: #28a745;
            margin-bottom: 10px;
            animation: bounce 1s ease;
        }
        h2 {
            color: #333;
            margin-bottom: 15px;
        }
        p {
            color: #555;
            font-size: 16px;
            margin-bottom: 25px;
        }
        .btn {
            background: linear-gradient(45deg, #ff5e62, #ff9966);
            color: white;
            padding: 12px 25px;
            border-radius: 25px;
            text-decoration: none;
            font-size: 16px;
            transition: 0.3s;
        }
        .btn:hover {
            background: linear-gradient(45deg, #ff9966, #ff5e62);
            box-shadow: 0 5px 12px rgba(0,0,0,0.3);
        }
        @keyframes zoomIn {
            from { transform: scale(0.8); opacity: 0; }
            to { transform: scale(1); opacity: 1; }
        }
        @keyframes bounce {
            0%   { transform: translateY(-20px); opacity: 0; }
            100% { transform: translateY(0); opacity: 1; }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="icon">✔</div>
        <h2>Registration Confirmed!</h2>
        <p>Welcome to <b>MTSolar</b> family 🌞<br>
        Your signup has been successfully confirmed </p>
        
    </div>
</body>
</html>
