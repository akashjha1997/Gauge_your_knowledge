<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminUpdate</title>

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

<form action="MyAdminUpdate" method="post">
<div class="input-container">
<input type="text" class="input-field"   name="qid" placeholder="enter question id you want to update"><br>
</div>
<div class="input-container">
<input type="text"   rows="3" cols="20"   class="input-field"   name="Question_creator"  placeholder="Enter QuestionCreator"><br>
</div>
<div class="input-container">
<textarea rows="3" class="input-field"   name="question"  placeholder="Enter the Question"></textarea><br>
</div>
<div class="input-container">
<input type="text"    class="input-field"  name="choice1"   placeholder="Enter choice 1"><br>
</div>
<div class="input-container">
<input type="text"   class="input-field"   name="choice2"  placeholder="Enter choice 2"><br>
</div>
<div class="input-container">
<input type="text"   class="input-field"   name="choice3"  placeholder="Enter choice 3"><br>
</div>
<div class="input-container">
<input type="text"   class="input-field"  name="choice4"   placeholder="Enter choice 4"><br>
</div>
<div class="input-container">
<select name="Selection" class="input-field"  >
<option value="" disabled selected>Choose Selection.....
  <option value="R">R</option>
  <option value="C">C</option>
  </select><br>
  </div>
  
  <div class="input-container">
 <select name="skill" class="input-field" >
  <option value="" disabled selected> Choose skill....
  <option value="java">JAVA</option>
  <option value="html">HTML</option>
</select><br>
</div>

<div class="input-container">
<select name="competencylevel" class="input-field" required> 
 <option value="" disabled selected>Choose competency level....
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  </select><br>
  </div>
  
  <div class="input-container">
<input type="text"  class="input-field" name="Mark"   placeholder="Enter Marks"><br>  
</div>
<div class="input-container">
<input type="text"  class="input-field"  name="Answer"  placeholder="Enter Answer"><br>
</div>
<input type="submit" value="submit" class="btn">

</form>


</body>
</html>