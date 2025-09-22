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
            margin: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #6a11cb, #2575fc);
        }

        .login-container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 10px 20px rgba(0,0,0,0.25);
            text-align: center;
            width: 350px;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .login-container:hover {
            transform: scale(1.03);
            box-shadow: 0 15px 30px rgba(0,0,0,0.3);
        }

        h2 {
            color: #4CAF50;
            margin-bottom: 20px;
        }

        input[type="email"], input[type="text"] {
            width: 100%;
            padding: 12px;
            margin: 12px 0;
            border: 2px solid #6a11cb;
            border-radius: 8px;
            outline: none;
            font-size: 16px;
            transition: border-color 0.3s ease, box-shadow 0.3s ease;
        }

        input[type="email"]:focus, input[type="text"]:focus {
            border-color: #4CAF50;
            box-shadow: 0 0 8px #4CAF50;
        }

        .checkbox {
            margin: 15px 0;
            text-align: left;
            font-size: 14px;
            color: #333;
        }

        .submit-btn {
            background: linear-gradient(135deg, #4CAF50, #6a11cb);
            color: #fff;
            border: none;
            padding: 14px;
            width: 100%;
            border-radius: 8px;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        .submit-btn:hover {
            background: linear-gradient(135deg, #6a11cb, #4CAF50);
            transform: scale(1.05);
            box-shadow: 0 8px 16px rgba(0,0,0,0.3);
        }
    </style>

</head>
<body>
	<form action="/SpringWebMvcZeptoLogin/register" method="post">
	
	<div class="login-container">
            <h2>Library Login</h2>
		Enter Name <input type="text" name="name"/><br>
		<br> Enter City Name : <input type="text" name="city" /><br>
		<br>  <input type="submit" />
</div>

	</form>
</body>
</html>