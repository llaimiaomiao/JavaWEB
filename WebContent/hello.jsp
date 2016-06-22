<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
				SessionID :<%=session.getId() %>
				<br><br>
				Is New :  <%=session.isNew() %>
				<br><br>
				MaxInactiveInterval  : <%=session.getMaxInactiveInterval() %>
				<br><br>
				CreateTime :  <%=session.getCreationTime() %>
				<br><br>
				LastAccessedTime : <%=session.getLastAccessedTime() %>
				<br><br>
				
				Hello!!!: :<%=request.getParameter("username") %>
				<%
						session.setAttribute("username", request.getParameter("username"));
				
				 %>

					<a href=<%=response.encodeURL("login.jsp") %>>返回登录</a>
					
					<a href=<%=response.encodeURL("logout.jsp") %>>注销</a>
</body>
</html>