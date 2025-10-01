<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Info</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f6f9;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 60%;
        margin: 80px auto;
        background: #fff;
        padding: 25px 40px;
        border-radius: 12px;
        box-shadow: 0 4px 15px rgba(0,0,0,0.1);
    }
    h1 {
        text-align: center;
        color: #333;
        margin-bottom: 30px;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 15px;
    }
    th, td {
        padding: 12px 15px;
        text-align: left;
        border-bottom: 1px solid #ddd;
        font-size: 16px;
    }
    th {
        background: #007BFF;
        color: white;
    }
    tr:hover {
        background-color: #f1f1f1;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Search Information</h1>
        <table>
            <tr>
                <th>ID</th>
                <td>${SearchInfo.id}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>${SearchInfo.name}</td>
            </tr>
            <tr>
                <th>Price</th>
                <td>${SearchInfo.price}</td>
            </tr>
        </table>
    </div>
</body>
</html>
