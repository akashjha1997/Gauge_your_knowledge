<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <%@page import="java.time.*" %>
     <%@page import=" java.text.SimpleDateFormat" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p id="demo"></p>
<%

/* LocalDateTime ld=LocalDateTime.now();
LocalDateTime ld1=ld.plusMinutes(30);
out.println(ld1);
System.out.println(ld);
//DateTimeFormatter dft=DateTimeFormatter.ofPattern("MMM dd,yyyy HH:mm:ss");*/

 SimpleDateFormat form = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");  
    Date date = new Date();  
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.MINUTE, 30);
 System.out.println(cal.getTime());
 String s=form.format(cal.getTime());
 request.setAttribute("s", s);

%>

<script>
// Set the date we're counting down to
var s_time="<%=(String)request.getAttribute("s")%>";
 document.writeln("End Time : "+s_time);
 
var countDownDate = new Date(s_time).getTime();

// Update the count down every 1 second
var x = setInterval(function() {

  // Get todays date and time
  var now = new Date().getTime();

  // Find the distance between now and the count down date
  var distance = countDownDate - now;

  // Time calculations for days, hours, minutes and seconds
  var days = Math.floor(distance / (1000 * 60 * 60 * 24));
  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);

  // Display the result in the element with id="demo"
  document.getElementById("demo").innerHTML = minutes + "m " + seconds + "s ";

  // If the count down is finished, write some text 
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("demo").innerHTML = "EXPIRED";
  }
}, 1000);
</script>
</body>
</html>