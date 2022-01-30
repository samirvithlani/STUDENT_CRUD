<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="studentinsertcontroller">
		<table>
			<tr>
				<td>ENTER STUDENT NAME:</td>
				<td><input type="text" name="txtStudentName"></td>
			</tr>
			<tr>
				<td>ENTER STUDENT EMAIL:</td>
				<td><input type="text" name="txtStudentEmail"></td>
			</tr>
			<tr>
				<td>ENTER STUDENT Password:</td>
				<td><input type="password" name="pwdStudentPassword"></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td><input type="radio" name="radioGender" value="male">MALE</td>
				<td><input type="radio" name="radioGender" value="female">FEMALE</td>
			</tr>
			<tr>
				<td>HOBBIES</td>
				<td><input type="checkbox" name="chHobbies" value="reading">READING</td>
				<td><input type="checkbox" name="chHobbies" value="traveling">TRAVELIING</td>
				<td><input type="checkbox" name="chHobbies" value="sports">SPORTS</td>
			</tr>
			<tr>
				<td>STUDENT CITY</td>
				<td><select name="selectCity">
						<option value="ahmedabad">AHMEDABAD</option>
						<option value="mumbai">MUMBAI</option>
						<option value="chennai">CHENNAI</option>

				</select></td>
			</tr>


			<tr>
				<td><input type="submit" value="ADD STUDENT"></td>
			</tr>
		</table>

	</form>

</body>
</html>