<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        form {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            width: 300px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.2);
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        label {
            font-weight: bold;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0 15px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="checkbox"] {
            margin-right: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background: #4CAF50;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background: #45a049;
        }
    </style>


	<form action="/SpringWebMvc4/register" method="post">
	
	<h2>Registration</h2>

	  <label for="fname">First Name:</label><br>
        <input type="text" id="fname" name="firstName" required><br>
        
        <label for="lname">Last Name:</label><br>
        <input type="text" id="lname" name="lastName" required><br>
        
        <label for="pwd">Password:</label><br>
        <input type="password" id="pwd" name="password" required><br>
        
        <input type="checkbox" id="agree" name="agree" value="yes" required>
        <label for="agree">I agree to the terms & conditions</label><br><br>
        
        <input type="submit" value="Submit">
	</form>
</body>
</html>