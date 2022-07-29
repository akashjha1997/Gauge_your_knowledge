<%@page import="com.cognizant.dao.AssessmentDao"%>
<%@page import="java.util.Date"%>
<%@page import="com.cognizant.serviceimpl.AssessmentServiceImpl"%>
<%@page import="com.cognizant.service.AssessmentService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cognizant.model.*"%>
<%@page import="com.cognizant.dao.LoginDao" %>
<%@page import="java.util.Calendar"%>
      <%@page import="com.cognizant.util.JdbcConnection" %>
    <%@page import="java.sql.*" %>
    <%@page errorPage="Error.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
   --main-color: #00004d;
}
#result {
   background-color: var(--main-color);
   padding: 15px;
}
#discover {
   color: white;
   padding-top: 100px;
}
#discover h3 {
   font-family: 'Kalam', cursive;
   transform: rotate(-5deg);
   padding: 0 80px;
}
.arrow {
   max-height: 60px;
   margin: 20px 10px;
}
#offer {
   background-color: white;
   text-align: center;
   padding: 15px;
   box-shadow: 5px 5px 20px #666;
}
#offer:hover {
  animation: shake 0.82s cubic-bezier(.36,.07,.19,.97) both;
  transform: translate3d(0, 0, 0);
  backface-visibility: hidden;
  perspective: 1000px;
}
@keyframes shake {
  10%, 90% {
    transform: translate3d(-1px, 0, 0);
  }
  
  20%, 80% {
    transform: translate3d(2px, 0, 0);
  }
  30%, 50%, 70% {
    transform: translate3d(-4px, 0, 0);
  }
  40%, 60% {
    transform: translate3d(4px, 0, 0);
  }
}
#offer > h1 {
   color: var(--main-color);
   margin-bottom: 35px;
}
#offer ul {
   font-size: 18px;
   list-style-type: none;
   padding: 25px;
}
#offer ul li {
   color: #666;
   margin-bottom: 15px;
}
#offer ul li > span {
   color: var(--main-color);
}
#offer > #price {
   background-color: var(--main-color);
   color: white;
   padding: 15px;
}
#offer > #price > h1 > sup {
   top: -.2em;
}
#offer > #price > a {
   color: white;
   text-decoration: underline;
   font-size: 18px;
}
#contact-me {
   color: white;
   padding: 50px;
   display: flex;
   align-items: flex-end;
}
#contact-me #bottom {
   padding-top: 200px;
}
@media screen and (max-width: 960px) {
   #contact-me #bottom {
      padding-top: inherit;
   }
}
#contact-me #label {
   text-align: center;
   margin-bottom: 20px;
}
#contact-me #submit {
   width: 100%;
   background-color: white;
   padding: 0;
   margin-bottom: 15px;
}
#contact-me #submit input { 
   border: 0;
   color: #666;
   width: 80%;
   height: 40px;
   padding: 10px;
}
#contact-me #submit button {
   border: 0;
   border-left: 2px solid #ddd;
   color: var(--main-color);
   background-color: white;
   width: 15%;
}
#contact-me #hr {
   color: rgba(255, 255, 255, 0.6);
   padding: 15px;
   margin-top: 15px;
}
#contact-me #hr hr {
   padding: 0;
   margin: 0;
}
#contact-me #hr span {
   line-height: 18px;
   top: -8px;
   position: relative;
   background-color: var(--main-color);
   padding: 0 10px;
}
#contact-me a#compare {
   color: white;
   text-decoration: underline;
   text-align: center;
   font-size: 16px;
   padding: 15px 0;
}
</style>
	<title></title>
</head>
<body>

<div class="row" id="result">
   <div class="col-md-4 hidden-xs hidden-sm" id="discover">
      <h3>Exams test your memory, life tests your learning; others will test your patience.</h3>
      <p class="text-right hidden-xs"><img class="arrow" src="https://i.imgur.com/56rM2t1.png" /></p>
   </div>
   <div class="col-md-4 col-xs-12" id="offer">
      <h1>Exam Score</h1>
      <ul>
      
     <script>
window.onload = function() {
	var marks=<%=(Integer)session.getAttribute("total")%>;
	var wmarks=10-marks;
	var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	title: {
		text: "Total Score"
	},
	data: [{
		type: "pie",
		startAngle: 240,
		yValueFormatString: "##0.00\"%\"",
		indexLabel: "{label} {y}",
		dataPoints: [
		{y: 0, label: ""},
			{y: wmarks, label: "wrong"},
			{y: marks, label: "Marks Obtained"},
	
		]
	}]
});
chart.render();

}

</script>
</head>
<body>
<div id="chartContainer" style="height: 300px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
      </ul>
      <div class="col-md-12" id="price">
         <h1>Click here for?<sup></sup></h1>
         <a href="userdashboard.jsp">Dashboard</a><a href="Logout">Logout</a>
      </div>
   </div>
   <div class="col-md-4 col-xs-12" id="contact-me">
      <div class="col-md-12 col-xs-12" id="bottom">
         <p class="text-left hidden-xs hidden-sm"><img class="arrow" src="https://i.imgur.com/QX03HSG.png" /></p>
         <form id="contact">
            <div class="col-md-12">
               <h4 id="label">Any Suggestions Write here!</h4>
            </div>
            <div class="col-md-12" id="submit">
            <form>
               <input name="review" id="email" placeholder="Type ......." required="true"/>
               <input type="submit">
               </form>
            </div>
           
            <div class="col-md-12 text-center">
               
            </div>
         </form>

      </div>
   </div>
   <p style="text-align: right; margin-right: 50px ; color:white; " id="compare">@CopyrightCts</p>
</div>
<%

//int marks=0;

AssessmentService aSer= new AssessmentServiceImpl();


String userid=(String)session.getAttribute("userid");
String examid=(String)session.getAttribute("examid");
String edescription=(String)session.getAttribute("examDescription");
String clevel=(String)session.getAttribute("clevel");
int score=(Integer)session.getAttribute("total");
//int assessmentid=idNum;



/* START TIME */
String startTime=(String)session.getAttribute("stime");


Date d = new Date(System.currentTimeMillis());



Calendar cal = Calendar.getInstance();
 int hr24=cal.get(Calendar.AM_PM);
String AM_PM=null;
if(hr24==1){
AM_PM="PM";
}else if(hr24==0){
AM_PM="AM";
}
 System.out.println(hr24);
cal.setTime(d);
String month=null;
switch (cal.get(Calendar.MONTH)) {
case 0:
month="JAN";
break;
case 1:
month="FEB";
break;
case 2:
month="MAR";
break;	
case 3:
month="APR";
break;	
case 4:
month="MAY";
break;
case 5:
month="JUN";
break;
case 6:
month="JUL";
break;
case 7:
month="AUG";
break;
case 8:
month="SEPT";
break;
case 9:
month="OCT";
break;
case 10:
month="NOV";
break;
case 11:
month="DEC";
break;

default:
break;
}





String ds=cal.get(Calendar.DATE)+"-"+month+"-"+cal.get(Calendar.YEAR)+" "+cal.get(Calendar.HOUR)+"."+cal.get(Calendar.MINUTE)+"."+cal.get(Calendar.SECOND)+" "+AM_PM;



System.out.println("END Time "+ds);

String endTime=ds;



AssessmentService aService= new AssessmentServiceImpl();
int aid=aSer.getAid();
int assessmentid=aid;

Assessment amodel=new com.cognizant.model.Assessment(userid, examid, edescription, clevel,  assessmentid,startTime,endTime, score);

if(!aService.insertAssessment(amodel)){
	
	
	throw new Exception();
	
	
}





%>

</body>
</html>