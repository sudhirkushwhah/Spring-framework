<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Email Verification</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
            background-color: #f9f9f9;
        }
        a.verify-btn {
            display: inline-block;
            padding: 12px 25px;
            font-size: 16px;
            font-weight: bold;
            color: #fff;
            background: #4CAF50;
            border-radius: 8px;
            text-decoration: none;
            transition: background 0.3s ease;
        }
        a.verify-btn:hover {
            background: #45a049;
        }
    </style>
</head>
<body>
    <h2>Email Verification</h2>
    <p>Please click the button below to verify your account:</p>
    <a class="verify-btn" href="emailverify?userId=${userId.userId}">
        ✅ Verify My Account
    </a>
</body>
</html>
