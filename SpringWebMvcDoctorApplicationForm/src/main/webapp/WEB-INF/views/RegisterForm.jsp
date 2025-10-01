<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/SpringWebMvcDoctorApplicationForm/registerform" method="post">

FirstName : <input type ="text" id="firstName" name="firstName"  required> <br><br>
lastName : <input type ="text" id="lastName" name="lastName" required> <br><br>
Age : <input type ="text" id="age" name="age" required> <br><br>
MobileNumber : <input type ="text" id="mobileNumber" name="mobileNumber" required> <br><br>
Address : <input type ="text" id="address" name="address" required> <br><br>
Appointment Time : <input type ="text" id="date" name="date" required> <br><br>
Summit : <input type="submit" name="submit"><br><br>
</form>

</body>
</html>