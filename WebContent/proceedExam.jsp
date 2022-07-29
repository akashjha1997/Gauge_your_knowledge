<%@page import="com.cognizant.serviceimpl.ExamServiceImpl"%>
<%@page import="com.cognizant.service.ExamService"%>
<%@page import="com.cognizant.daoImpl.ExamDaoImpl"%>
<%@page import="com.cognizant.model.*"%>
<%@page import="com.cognizant.dao.LoginDao" %>
      <%@page import="com.cognizant.util.JdbcConnection" %>
    <%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cognizant.dao.ExamDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String eid=null;
Connection con=null;
con=JdbcConnection.getConnection();
String query="select max(to_number(substr(examid,3),9999)) from exam order by examid";
PreparedStatement pst=null;
ResultSet rs=null;
int idNum=0;
try {
pst=con.prepareStatement(query);
rs=pst.executeQuery();
rs.next();
idNum=rs.getInt(1);
System.out.println("id from db : "+idNum);
String id="ex";
idNum=idNum+1;
StringBuilder sb=new StringBuilder(id);
sb.append(idNum);
eid=sb.toString();
System.out.println("id after editing : "+eid);
//session.setAttribute("sid", eid);



} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
finally{
if(rs != null){
try {
rs.close();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
if (pst != null){
try {
pst.close();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
} 
if(con != null){
try {
con.close();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
} 





///////////////////////////////////Connection con=null;

String examid=eid;//(String)session.getAttribute("sid");//request.getParameter("Email");
//request.getParameter("User_Id");
String clevel=request.getParameter("CompetencyLevel");
System.out.println(clevel);

String skill=request.getParameter("skill");
System.out.println(skill);

session.setAttribute("examid", examid);
session.setAttribute("clevel", clevel);
session.setAttribute("skill", skill);


String examDescription=null;



if(skill.equals("java"))
{
examDescription="java mcq";
}else{
	examDescription="html mcq";
}

session.setAttribute("examDescription", examDescription);


String userid=request.getParameter("userid");
System.out.println(" edited id : "+examid);
System.out.println(examDescription);
System.out.println(clevel);
System.out.println(skill);
System.out.println(userid);




	ExamService eService=new ExamServiceImpl();
	Exam eModel=new com.cognizant.model.Exam(examid,examDescription,skill,clevel,userid);
	
	if(eService.insertExam(eModel)){
		
		response.sendRedirect("PaperGeneration");
	}
	



System.out.println("user id in proceedExam : "+userid);

%>

</body>
</html>