<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@page import="com.cognizant.daoImpl.LoginDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cognizant.dao.LoginDao" %>
      <%@page import="com.cognizant.util.JdbcConnection" %>
    <%@page import="java.sql.*" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%




String m_email=request.getParameter("email");
String m_password=request.getParameter("password");
String m_emptype=request.getParameter("emptype");
System.out.println(m_emptype);
LoginDao ldao=new LoginDaoImpl();

if(ldao.validateLogin(m_email, m_password, m_emptype) && (m_emptype.equalsIgnoreCase("A") || m_emptype.equalsIgnoreCase("a") ))
{
	//session.setAttribute("userid", userid);
	LoginDao ldao1= new LoginDaoImpl();
	String userid=ldao1.getUserId(m_email, m_password, m_emptype);
	String name=ldao1.getUsername(m_email, m_password, m_emptype);
	session.setAttribute("userid",userid);
	session.setAttribute("name", name);
	
	response.sendRedirect("admindashboard.jsp");
}
else if(  ldao.validateLogin(m_email, m_password, m_emptype) && (m_emptype.equalsIgnoreCase("U") || m_emptype.equalsIgnoreCase("u") )  ){

	LoginDao ldao1= new LoginDaoImpl();
	String userid=ldao1.getUserId(m_email, m_password, m_emptype);
	String name=ldao1.getUsername(m_email, m_password, m_emptype);
	session.setAttribute("userid",userid);
	session.setAttribute("name", name);
	
	response.sendRedirect("userdashboard.jsp");
}
else{%>


<script type="text/javascript">

alert("INVALID CREDENTIALS");

</script>

<% 	
response.sendRedirect("login.html");
}


%>

</body>
</html>