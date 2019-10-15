<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ADDING STUDENT
<form action="checkStudentExist">
 <table>
  <tr><td><h1>Check if the student exist... </h1></td></tr>
  <tr><td><h1>Please enter the student Id </h1></td><td><input type="text" name="stdId"></td></tr>
 </table>
  <input type="submit"><br>
 </form> 

The student exist or no ?? ${isExist}

 <form action="addNewStudent">
 <table>
  <tr><td><h1>Student Name : </h1></td><td><input type="text" name="stdName"></td></tr>
  <tr><td><h1>Student Id : </h1></td><td><input type="text" name="stdId"></td></tr>
  <tr><td><h1>Student Language : </h1></td><td><input type="text" name="stdLang"></td></tr>
  </table>
  <input type="submit"><br>
 </form> 

</body>
</html>