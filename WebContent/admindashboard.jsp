<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="dashboard.css">
</head>
<body>
<section id="sidebar"> 
  <div class="white-label">
  </div> 
  <div id="sidebar-nav">   
    <ul>
      <li class="active"><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
      <li><a href="#"><i class="fas fa-user-edit"></i> Profile</a></li>
      <li><a href="AdminInsert.jsp"><i class="fas fa-book-open"></i> Insert Question</a></li>
      <li><a href="AdminUpdate.jsp"><i class="fa fa-copy"></i>Update Question</a></li>
      <li><a href="AdminDelete.jsp"><i class="fa fa-scissors"></i>Delete Question</a></li>
    </ul>
  </div>
</section>
<section id="content">
  <div id="header">
    <div class="header-nav">
      <div class="menu-button">
        <!--<i class="fa fa-navicon"></i>-->
      </div>
      <div class="nav">
        <ul>
        <li><i id="user" class='fas fa-user' style="height:20px;width:20px;margin-top:10px;"></i></li>
          <li class="nav-profile">
            <div class="nav-profile-image">
               <div class="nav-profile-name"> <a href="Logout">Logout</a></div>
              <div class="nav-profile-name"><%=session.getAttribute("name") %></div>
            
            </div>
          </li>
        </ul>
      </div>
    </div>
  </div>
  <div class="content">
    <div class="content-header">
      <h1></h1>
      <p></p>
    </div>
   <!--  <div class="box">
		<a class="button" href="startExam.jsp">Take Test</a>
    </div> -->
    </div>
</section>
</body>
</html>