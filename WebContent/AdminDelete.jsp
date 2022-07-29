<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.input-div{
margin-top:80px;
margin-left:520px;
}
.input-container {

  
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
<div class="in"  style="margin-left: 470px">
<p class="para" style="margin-left: 10px;"><h4>........Enter the question id of question you want to delete.......</h4></p><br>

<form action="MyAdminDelete" Method="post">

<div class="input-container">
<input class="input-field"   type="text" name="Question_id" class="submit">
</div>
<input type="submit" value="Delete question" class="btn">
</form>
</div>
</body>
</html>