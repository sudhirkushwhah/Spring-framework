<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Kodewala Academy - Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #43cea2, #185a9d);
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
            width: 400px;
        }
        h2 {
            color: #333;
            text-align: center;
            margin-bottom: 25px;
        }
        .form-group {
            margin-bottom: 18px;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 6px;
            color: #444;
        }
        input, select {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 10px;
            font-size: 15px;
        }
        .btn {
            width: 100%;
            padding: 14px;
            background: linear-gradient(90deg, #ff512f, #dd2476);
            color: white;
            font-size: 17px;
            font-weight: bold;
            border: none;
            border-radius: 50px;
            cursor: pointer;
            transition: all 0.3s ease;
            margin-top: 10px;
        }
        .btn:hover {
            background: linear-gradient(90deg, #dd2476, #ff512f);
            transform: scale(1.05);
            box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Kodewala Academy Registration</h2>
        <form action="/SpringWebMvcKodewalaAcademy_ModelAttribute/registerSuccess" method="post">
            
            <div class="form-group">
                <label for="name">Full Name</label>
                <input type="text" id="name" name="name" required>
            </div>
            
            <div class="form-group">
                <label for="city">City</label>
                <input type="text" id="city" name="city" required>
            </div>
            
            <div class="form-group">
                <label for="contact">Contact</label>
                <input type="text" id="contact" name="contact" required>
            </div>
            
            <div class="form-group">
                <label for="course">Course</label>
                <select id="course" name="course" required>
                    <option value="">-- Select Course --</option>
                    <option value="Java">Java</option>
                    <option value="Python">Python</option>
                    <option value="Web Development">Web Development</option>
                    <option value="Data Science">Data Science</option>
                </select>
            </div>
            
            <button type="submit" class="btn">Register</button>
        </form>
    </div>
</body>
</html>
