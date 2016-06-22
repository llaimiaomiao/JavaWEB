	<%@page import="com.leilei.miaomiao.javaWeb.Custorm"%>
<%@page import="sun.java2d.loops.CustomComponent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
						
						<jsp:useBean id="custorm" class="com.leilei.miaomiao.javaWeb.Custorm" scope="session"></jsp:useBean>
						<%-- <%
								Custorm  custrom   = (Custorm)session.getAttribute("custorm");
								if(custrom!=null){
								 	custorm = (Custorm)Class.forName("com.leilei.miaomiao.javaWeb.Custorm").newInstance();
									session.setAttribute("custorm", custorm);
								}
						 %> --%>
						 <jsp:setProperty property="*"  name="custorm"/>
						
						 <jsp:getProperty property="age" name="custorm"/>
						 age: <%=custorm.getAge() %>
						 <jsp:getProperty property="name" name="custorm"/>
						name: <%=custorm.getName() %>
						 <jsp:getProperty property="date" name="custorm"/>
						date: <%=custorm.getDate() %>
						
	</body>
	</html>