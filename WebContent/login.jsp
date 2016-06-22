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
				<%
						Object userName = session.getAttribute("username");
						if(userName==null){
							userName = "";
						}
				
				 %>
					<form action= <%= response.encodeURL("hello.jsp")%>>
					userName: <input type="text" name="username" 
					value="<%=userName%>"><br><br>
					password : <input type="password">
					 <input type="submit" value="登录">
					</form>
</body>
</html>