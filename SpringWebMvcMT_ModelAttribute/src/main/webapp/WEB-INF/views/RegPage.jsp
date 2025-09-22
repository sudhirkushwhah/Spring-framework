<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Maurya Traders - Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0px 8px 15px rgba(0,0,0,0.2);
            width: 350px;
            text-align: center;
        }
        h2 {
            color: #333;
            margin-bottom: 20px;
        }
        input[type="text"], input[type="email"], input[type="tel"] {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            outline: none;
            transition: 0.3s;
        }
        input[type="text"]:focus, input[type="email"]:focus, input[type="tel"]:focus {
            border-color: #2575fc;
            box-shadow: 0px 0px 8px rgba(37,117,252,0.5);
        }
        .checkbox {
            margin: 15px 0;
            text-align: left;
        }
        input[type="submit"] {
            background: linear-gradient(45deg, #2575fc, #6a11cb);
            color: white;
            border: none;
            padding: 12px 25px;
            border-radius: 25px;
            cursor: pointer;
            font-size: 16px;
            transition: 0.3s;
        }
        input[type="submit"]:hover {
            background: linear-gradient(45deg, #6a11cb, #2575fc);
            box-shadow: 0px 5px 10px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Maurya Traders Registration</h2>
        <form action="/SpringWebMvcMT_ModelAttribute/register" method="post">
            <input type="text" name="name" placeholder="Enter Full Name" required><br>
            <input type="tel" name="contact" placeholder="Enter Contact Number" required><br>
            <input type="email" name="email" placeholder="Enter Email Address" required><br>
            
            <div class="checkbox">
                <input type="checkbox" name="terms" required> I agree to the Terms & Conditions
            </div>
            
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
