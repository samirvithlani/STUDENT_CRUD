<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<StudentBean> studentList = (List<StudentBean>) request.getAttribute("students");
	%>

	<table>
		<tr>
			<th>SID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>CITY</th>
			<th>GENDER</th>
			<th>HOBBIES</th>
		</tr>

		<%
			for (int i = 0; i < studentList.size(); i++) {

			StudentBean studentBean = studentList.get(i);
		%>
		<tr>
			<td><%=studentBean.getsId()%></td>
			<td><%=studentBean.getsEmail()%></td>
			<td><%=studentBean.getsEmail()%></td>
			<td><%=studentBean.getsPassword()%></td>
			<td><%=studentBean.getsCity()%></td>
			<td><%=studentBean.getsGender()%></td>
			<td><%=studentBean.getsHobbies()%></td>
			<td><a
				href="studentdeletecontroller?id=<%=studentBean.getsId()%>">DELETE</a></td>
		</tr>

		<%
			}
		%>


	</table>
</body>
</html>