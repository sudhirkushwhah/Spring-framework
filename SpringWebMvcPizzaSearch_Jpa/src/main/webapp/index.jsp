<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dominos Pizza Search</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f8f8f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: #fff;
            padding: 25px 40px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.15);
            text-align: center;
        }
        h1 {
            color: #e31837;
            margin-bottom: 20px;
        }
        input[type="text"] {
            padding: 10px;
            width: 250px;
            border: 1px solid #ccc;
            border-radius: 8px;
            outline: none;
            margin-bottom: 20px;
        }
        input[type="text"]:focus {
            border-color: #e31837;
        }
        input[type="submit"] {
            background: #e31837;
            color: #fff;
            border: none;
            padding: 10px 18px;
            border-radius: 8px;
            cursor: pointer;
            font-weight: bold;
        }
        input[type="submit"]:hover {
            background: #b51228;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>🍕 Domino’s Pizza Search</h1>
        <form action="searchPizza" method="get">
            <input type="text" name="searchString"  required /><br>
            <input type="submit" value="Search Pizza">
        </form>
    </div>
</body>
</html>
