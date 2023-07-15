<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Student> list=(List<Student>)request.getAttribute("list");  %>
<table border="1">
<tr><th>Sno</th><th>Sname</th><th>Semail</th><th>Update</th><th>Delete</th></tr>
<% for(Student s:list){%>
<tr><td><%=s.getSid() %></td><td><%=s.getName() %></td><td><%=s.getEmail()%></td>
<td><a href="updateindex.jsp">Edit Student</a></td>
<td><a href="deleteindex.jsp">delete Student</a></td>
</tr>
<%}%>
<a href="index.jsp">insert more students</a>
</table>
</body>
</html>

