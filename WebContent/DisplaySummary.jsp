<%@page import="java.util.Calendar"%>
<%@page import="com.cognizant.model.Assessment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.cognizant.dao.SummaryDao"%>
<%@page import="com.cognizant.daoImpl.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style> 







@import "compass/css3";

@import "compass/css3";
@import url(https://fonts.googleapis.com/css?family=Patua+One|Open+Sans);

* { 
  -moz-box-sizing: border-box; 
  -webkit-box-sizing: border-box; 
	box-sizing: border-box; 
}

body {
  background:#353a40;
}

table {
  border-collapse: separate;
  background:#fff;
  @include border-radius(5px);
  margin:50px auto;
  @include box-shadow(0px 0px 5px rgba(0,0,0,0.3));
}

thead {
  @include border-radius(5px);
}

thead th {
  font-family: 'Patua One', cursive;
  font-size:16px;
  font-weight:400;
  color:grey;
  @include text-shadow(1px 1px 0px rgba(0,0,0,0.5));
  text-align:left;
  padding:20px;
  @include background-image(linear-gradient(#646f7f, #4a5564));
  border-top:1px solid #858d99;
  
  &:first-child {
   @include border-top-left-radius(5px); 
  }

  &:last-child {
    @include border-top-right-radius(5px); 
  }
}

tbody tr td {
  font-family: 'Open Sans', sans-serif;
  font-weight:400;
  color:#5f6062;
  font-size:13px;
  padding:20px 20px 20px 20px;
  border-bottom:1px solid #e0e0e0;
  
}

tbody tr:nth-child(2n) {
  background:#f0f3f5;
}

tbody tr:last-child td {
  border-bottom:none;
  &:first-child {
    @include border-bottom-left-radius(5px);
  }
  &:last-child {
    @include border-bottom-right-radius(5px);
  }
}

tbody:hover > tr td {
  @include opacity(0.5);
  
  /* uncomment for blur effect */
  /* color:transparent;
  @include text-shadow(0px 0px 2px rgba(0,0,0,0.8));*/
}

tbody:hover > tr:hover td {
  @include text-shadow(none);
  color:#2d2d2d;
  @include opacity(1.0);
}
</style>
</head>
<body>
<a href="Logout" style="margin-left:450px; color: white; "><h4>Logout</h4></a>
<h1 style="text-align: center; color: white;">TEST SUMMARY</h1>
<table style="width:100%" class = "one">
<thead>
<tr>
<th>USERID</th>
<th>EXAMID</th> 
<th>EXAM DESCRIPTION</th>
<th>COMPETENCY LEVEL</th>
<th>ASSESSMENT ID</th>
<th>START TIME</th>
<th>END TIME</th>
<th>SCORE</th>
</tr>
</thead>
<%
PrintWriter pw= response.getWriter();
String userid=(String)session.getAttribute("userid");
SummaryDao sDao=new SummaryDaoImpl();
ArrayList <Assessment> asList=null;
asList=sDao.getSummary(userid);
int length=asList.size();
for(Assessment a : asList)
{
%>
	<tbody>
	<tr>
	<td class = "a"><%=a.getUserid() %></td>
	<td class = "a"><%=a.getExamid()%></td>
	<td class = "a"><%=a.getExamdescription()%></td>
	<td class = "a"><%=a.getCompetencylevel() %></td>
	<td class = "a"><%=a.getAssessmentid() %></td>
	<%
	

	%>
	
	<td class = "a"><%=a.getStime()%></td>
	<td class = "a"><%=a.getEtime() %></td>
	<td class = "a"><%=a.getScore() %></td>
	</tr>        
</tbody>
<% 
}
%>
</table>
</body>
</html>