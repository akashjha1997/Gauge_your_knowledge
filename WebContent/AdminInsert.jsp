<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Insert</title>

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

<form action="AdminInsert" method="post">

<div class="input-container">

<input class="input-field" placeholder="Enter QuestionId...."  type="text"  name="Question_id"   required>


</div>
<br>
<div class="input-container">
<input class="input-field"  type="text"  placeholder="Enter Admin Id...."   name="Question_creator"  required><br>
</div>
<div class="input-container">
<textarea class="input-field" rows="3" cols="20"    placeholder="Enter the Question....." name="Question"   required></textarea><br>
</div>

<div class="input-container">
<input  class="input-field"  type="text"class="text" name="Choice1"  placeholder="Enter choice 1...."  required><br>
</div>
<div class="input-container">
<input class="input-field"  type="text"class="text" name="Choice2"  placeholder="Enter choice 2...."  required><br>
</div>
<div class="input-container">
<input class="input-field"  type="text"class="text" name="Choice3"   placeholder="Enter choice 3...."  required><br>
</div>

<div class="input-container">
<input  class="input-field" type="text"class="text" name="Choice4"  placeholder="Enter choice 4...."  required> <br>
</div>


<div class="input-container">
<select name="Selection"   class="input-field"   required>
<option value="" disabled selected>Select Type of Question....
  <option value="R">Radio Button</option>
  <option value="C">Check Box</option>
  </select>
  </div><br>


<div class="input-container"  >
 <select name="SkillSet"   class="input-field"  required>
 <option value="" disabled selected>Select Skill Set....
  <option value="java">JAVA</option>
  <option value="html">HTML</option>
</select><br>
</div>
<div class="input-container">
<select name="CompetencyLevel" class="input-field" placeholder="Enter competency level...."  required>
<option value="" disabled selected>Select Competency Level....
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  </select><br>
</div>
<div class="input-container">
<input  class="input-field"   type="text"  name="Answer"  placeholder="Correct Answer......"  required> <br>
</div>

<!-- Enter Marks<input type="text"class="text" name="Mark"><br>   -->

<input type="submit" value="submit" class="btn">


</form>
</div>
</html>