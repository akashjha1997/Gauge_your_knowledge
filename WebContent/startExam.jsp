<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.text.SimpleDateFormat" %>
     <%@page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start Exam</title>
<style>
.input-div{
margin-top:80px;
margin-left:520px;
}
.input-container {

  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 310px;
  margin-bottom: 15px;
  
}
.input-field {
  width: 100%;
  margin-left: 40px;
  padding: 10px;
  outline: none;
}

.input-field:focus {
  border: 2px solid #404040;
}


.btn {

  background-color: transparent;
  border: 3px solid black;
  color: black;
  padding: 15px 20px;
  cursor: pointer;
  width: 320px;
  opacity: 0.9;
  margin-left: 17px
}

.btn:hover {
color:black;
  opacity: 1;
}


hr.hr{
margin-top:40px;
  border: 25px solid grey;
  border-radius: 5px;
}
</style>




</head>




<body>
<hr class="hr">
<div>
</div>
<div class="input-div">

<form action="proceedExam.jsp"  method="post">

<p class="para" style="margin-left: 10px;"><h4>Please select appropriate competency level and skill set.</h4></p><br>

<div class="input-container">
	
   <select class="input-field"  name="CompetencyLevel"  required>
   <option value="" disabled selected>Select Competency Level....
    <option value="1">Level 1</option>
    <option value="2">Level 2</option>
    <option value="3">Level 3</option>
   </select>
   </div>
   <div class="input-container">
   <select class="input-field"  name="skill"  placeholder=" Skill"  required>
    <option value="" disabled selected>Select Skill....
    <option  value="java">JAVA</option>
    <option value="html">HTML</option>
    
  </select>
  <%
  String userid=(String)session.getAttribute("userid");
  System.out.println("jsp Start exam 1 : "+(String)session.getAttribute("userid"));
  System.out.println("jsp Start exam 2 : "+userid);
  
  Date d=new Date();
  
  %>
    
   <input type="hidden" name="userid" value="<%=userid %>">
  </div>
  <br>
  
<input type="submit"  value="PROCEED"  class="btn">

</form>
</div>
</body>
</html>