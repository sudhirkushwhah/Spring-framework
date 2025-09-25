<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f8ff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .box {
            background: #fff;
            padding: 25px 35px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
            text-align: center;
            width: 350px;
        }
        h2 {
            color: #007BFF;
            margin-bottom: 15px;
        }
        p {
            font-size: 16px;
            margin: 8px 0;
        }
        .btn {
            display: inline-block;
            margin-top: 15px;
            padding: 10px 15px;
            background: #007BFF;
            color: white;
            border-radius: 6px;
            text-decoration: none;
        }
        .btn:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>

    <div class="box">
        <h2>Registration Successful 🎉</h2>
        <p><strong>UserId:</strong> <%= request.getParameter("userId") %></p>
        <p><strong>First Name:</strong> <%= request.getParameter("firstname") %></p>
        <p><strong>Last Name:</strong> <%= request.getParameter("lastname") %></p>
        <p><strong>Email:</strong> <%= request.getParameter("email") %></p>

    </div>

</body>
</html>
