package com.cognizant.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.model.Question;
import com.cognizant.service.QuestionPaperService;
import com.cognizant.serviceimpl.QuestionPaperServiceImpl;
public class PaperGeneration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PaperGeneration() {
        super();
       
    }

    
    void createPage(PrintWriter out,ArrayList<Question> aList, int count,HttpSession session){
      	    int i=count;
    	
    	
    	//int count1= (Integer)session.getAttribute("count");
    	if(count == 10){
    		out.println("<html><head>");
    		out.println("</head><body>");
			 out.println("<form action='ResultDemo' method='post' >");
			 out.println("<tr><td><input type='submit' value='Finish'></td></tr>");
			 out.println("</form></body></html>");
			
		}
    	else	{
    	//	 String option="option"+i;
    		out.println("<html><head>");
    		
    		
    		 out.write("\t<style type=\"text/css\">\r\n");
    	      out.write("\t\thr.hr1 {\r\n");
    	      out.write("  border: 20px solid #b82e8a;\r\n");
    	      out.write("  \r\n");
    	      out.write("  border-radius: 0px;\r\n");
    	      out.write("}\r\n");
    	      out.write("input[type=submit]:hover {\r\n");
    	      out.write("  background-color: #e085c2;\r\n");
    	      out.write("}\r\n");
    	      out.write("input[type=submit]{\r\n");
    	      out.write("  \r\n");
    	      out.write("  background-color:#b82e8a;\r\n");
    	      out.write("  color: white;\r\n");
    	      out.write("  padding: 14px 20px;\r\n");
    	      out.write("  margin: 8px 0;\r\n");
    	      out.write("  border: none;\r\n");
    	      out.write("  border-radius: 4px;\r\n");
    	      out.write("  cursor: pointer; ;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/*for radio button*/\r\n");
    	      out.write(".container {\r\n");
    	      out.write("  display: block;\r\n");
    	      out.write("  position: relative;\r\n");
    	      out.write("  padding-left: 35px;\r\n");
    	      out.write("  margin-bottom: 12px;\r\n");
    	      out.write("  cursor: pointer;\r\n");
    	      out.write("  font-size: 22px;\r\n");
    	      out.write("  -webkit-user-select: none;\r\n");
    	      out.write("  -moz-user-select: none;\r\n");
    	      out.write("  -ms-user-select: none;\r\n");
    	      out.write("  user-select: none;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* Hide the browser's default radio button */\r\n");
    	      out.write(".container input {\r\n");
    	      out.write("  position: absolute;\r\n");
    	      out.write("  opacity: 0;\r\n");
    	      out.write("  cursor: pointer;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* Create a custom radio button */\r\n");
    	      out.write(".checkmark {\r\n");
    	      out.write("  position: absolute;\r\n");
    	      out.write("  top: 0;\r\n");
    	      out.write("  left: 0;\r\n");
    	      out.write("  height: 25px;\r\n");
    	      out.write("  width: 25px;\r\n");
    	      out.write("  background-color: #eee;\r\n");
    	      out.write("  border-radius: 50%;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* On mouse-over, add a grey background color */\r\n");
    	      out.write(".container:hover input ~ .checkmark {\r\n");
    	      out.write("  background-color: #ccc;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* When the radio button is checked, add a blue background */\r\n");
    	      out.write(".container input:checked ~ .checkmark {\r\n");
    	      out.write("  background-color: #b82e8a;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* Create the indicator (the dot/circle - hidden when not checked) */\r\n");
    	      out.write(".checkmark:after {\r\n");
    	      out.write("  content: \"\";\r\n");
    	      out.write("  position: absolute;\r\n");
    	      out.write("  display: none;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* Show the indicator (dot/circle) when checked */\r\n");
    	      out.write(".container input:checked ~ .checkmark:after {\r\n");
    	      out.write("  display: block;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("/* Style the indicator (dot/circle) */\r\n");
    	      out.write(".container .checkmark:after {\r\n");
    	      out.write(" \ttop: 9px;\r\n");
    	      out.write("\tleft: 9px;\r\n");
    	      out.write("\twidth: 8px;\r\n");
    	      out.write("\theight: 8px;\r\n");
    	      out.write("\tborder-radius: 50%;\r\n");
    	      out.write("\tbackground: white;\r\n");
    	      out.write("}\r\n");
    	      out.write("\r\n");
    	      out.write("\r\n");
    	      out.write("\t</style>\r\n");
    		
    		
    	      
    	      //timer
    	     
    	      
    	      
    		
    		out.println("</head>");
    		out.write("<body style=\"margin-top: 80px ; font-size: 20px\">\r\n");
    	  //T1	 Random rand = new Random();
			    
    		//T1      int randomIndex = rand.nextInt(aList.size());
    		//T1   Question randomElement = aList.get(randomIndex);
		        //System.out.println("random "+randomIndex+" "+randomElement);
		        
    		 out.write("<fieldset style=\"border: `10px solid #00224c; margin-top:100px\">\r\n");
    			out.println("<form action='PaperGeneration' method='post' >");
    			
    			System.out.println(count+" in Create page");
    			System.out.println(aList);               
    			Question q=    aList.get(count);   
    			//T1 Question q=    aList.get(randomIndex);   
    			//T1aList.remove(randomIndex);
    			/* T1 ArrayList<String> givenList = new ArrayList<String>();
    			      		 givenList.add(q.getChoice1());   
    			      		 givenList.add(q.getChoice2());
    			      		 givenList.add(q.getChoice3());
    			      		 givenList.add(q.getChoice4());
    			      		 String choice[]=new String [4];
    			      		 int numberOfElements = 4;
    			      		 Random rand1 = new Random();
    			      		 for (int j = 0; j < numberOfElements; j++) 
    			      		 {
    			      		 int randomIndex1 = rand1.nextInt(givenList.size());
    			      		 String randomElement1 = givenList.get(randomIndex1);
    			      		 choice[j]=randomElement1;
                             givenList.remove(randomIndex1);
    			              }*/     
    			               
    			               
    			     out.println("<table>");
    			     
    			     out.write("<hr class=\"hr1\">\r\n");
    			     out.println("<tr><td>Q "+(i+1)+q.getQuestion()+"</td></tr>" );
    			    // out.println("<input type='textarea' value=Q "+(i+1)+q.getQuestion()+">");
    			   
    			   
    			//   For Question having Radio Button
    			  
    			   
    			   if(q.getSelection().equals("R"))
    	             { 
    				   out.write("<label class=\"container\">\r\n");
    	              out.println("<td><input type='radio' name='option' value='"+q.getChoice1()+"'>"+q.getChoice1()+"</td></tr>" );
    	              out.write("<span class=\"checkmark\"></span>\r\n");
    	              out.write("</label>\r\n");
    	              out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='radio' name='option'  value='"+q.getChoice2()+"' >"+q.getChoice2()+"</td></tr>");
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				   out.write("</label>\r\n");
    				  out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='radio' name='option'  value='"+q.getChoice3()+"' >"+q.getChoice3()+"</td></tr>"); 
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				   out.write("</label>\r\n");
    				  out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='radio' name='option'  value='"+q.getChoice4()+"' >"+q.getChoice4()+"</td></tr>"); 
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				   out.write("</label>\r\n");
    			     }
    			 
    			  
    			 // For CheckBox  
    			  
    			  
    			  else if(q.getSelection().equals("C")){
    				  
    				  out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='checkbox' name='option1' value='"+q.getChoice1()+"' >"+q.getChoice1()+"</td></tr>"); 
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				    out.write("</label>\r\n");
    				    
    				    out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='checkbox' name='option1'  value='"+q.getChoice2()+"' >"+q.getChoice2()+"</td></tr>");
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				    out.write("</label>\r\n");
    				    
    				    out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='checkbox' name='option1'  value='"+q.getChoice3()+"' >"+q.getChoice3()+"</td></tr>"); 
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				    out.write("</label>\r\n");
    				    
    				    out.write("<label class=\"container\">\r\n");
    				  out.println("<td><input type='checkbox' name='option1'  value='"+q.getChoice4()+"'>"+q.getChoice4()+"</td></tr>");	
    				  out.write("<span class=\"checkmark\"></span>\r\n");
    				    out.write("</label>\r\n");
    			     }
    			     count=count+1;
    			     session.setAttribute("count", count);
    			//     System.out.println("test "+count);
    			     out.println("<tr><td><input type='hidden' name='questionid' value='"+q.getQuestion_id()+"'></td></tr>");
    			     if(count>1 && count<=10){
    			    	 out.println("<tr><td><input type='submit' name='button' value='Prev'></td></tr>");
    			     }
    	             
    	             out.println("<tr><td><input type='submit' name='button' value='Next'></td></tr>");
    	             out.write("</form>");
    	             out.write("</fieldset>\r\n");
    			     out.println("</body></html>");
                     }
                     }


   
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      	   PrintWriter out=response.getWriter();
	      	   
	 	   
	      	 out.write("<div style=\"font-weight: bold\" id=\"quiz-time-left\"></div>\r\n");
	   	      out.write("<script type=\"text/javascript\">\r\n");
	   	      out.write("var max_time = 1;\r\n");
	   	      out.write("var c_seconds  = 0;\r\n");
	   	      out.write("var total_seconds =60*max_time;\r\n");
	   	      out.write("max_time = parseInt(total_seconds/60);\r\n");
	   	      out.write("c_seconds = parseInt(total_seconds%60);\r\n");
	   	      out.write("document.getElementById(\"quiz-time-left\").innerHTML='Time Left: ' + max_time + ' minutes ' + c_seconds + ' seconds';\r\n");
	   	      out.write("function init(){\r\n");
	   	      out.write("document.getElementById(\"quiz-time-left\").innerHTML='Time Left: ' + max_time + ' minutes ' + c_seconds + ' seconds';\r\n");
	   	      out.write("setTimeout(\"CheckTime()\",999);\r\n");
	   	      out.write("}\r\n");
	   	      out.write("function CheckTime(){\r\n");
	   	      out.write("document.getElementById(\"quiz-time-left\").innerHTML='Time Left: ' + max_time + ' minutes ' + c_seconds + ' seconds' ;\r\n");
	   	      out.write("if(total_seconds <=0){\r\n");
	   	      out.write("setTimeout('document.quiz.submit()',1);\r\n");
	   	      out.write("    \r\n");
	   	      out.write("    } else\r\n");
	   	      out.write("    {\r\n");
	   	      out.write("total_seconds = total_seconds -1;\r\n");
	   	      out.write("max_time = parseInt(total_seconds/60);\r\n");
	   	      out.write("c_seconds = parseInt(total_seconds%60);\r\n");
	   	      out.write("setTimeout(\"CheckTime()\",999);\r\n");
	   	      out.write("}\r\n");
	   	      out.write("\r\n");
	   	      out.write("}\r\n");
	   	      out.write("init();\r\n");
	   	      out.write("</script>\r\n");
	   	      out.write("\r\n");
	      	   
	      	   
	      	   
	           HttpSession session = request.getSession();
			   Integer count=(Integer) request.getAttribute("count");
			   
			   
             
               session.setAttribute("count", count);
			   QuestionPaperService qService= new QuestionPaperServiceImpl();
		    	
			   //       QuestionDao qDao= new QuestionDaoImpl();
			   ArrayList<Question>aList=(ArrayList<Question>)session.getAttribute("questions");  
			   if (count==null && aList==null){
	               count=0;
	              
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
	          System.out.println("Start Time "+ds);
	               session.setAttribute("stime",ds);
	               
	               // exam start time
	             
	         //  System.out.println("in get "+count);
	           String clevel=(String) session.getAttribute("clevel");
	           String skill=(String) session.getAttribute("skill");
	           aList=qService.getQuestionPaper1(skill,clevel);
	        	int x=1; 
	           for(Question Q:aList ){
	        		 System.out.println(x+" "+Q.getQuestion());
	        	  x++; 
	           }
	           
	           
			   }
	           session.setAttribute("question", aList);
			   createPage(out,aList, count, session);
			    }

void getPrevious(PrintWriter out,int count,ArrayList<Question>aList,HttpSession session){
	
	count--;
	session.setAttribute("count", count);
	createPage(out, aList,  count, session);
	
	System.out.println(count);
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     PrintWriter out= response.getWriter();
		     
	
		     
		     HttpSession session = request.getSession(false);
		   //  System.out.println(session.isNew());
		     Integer count=(Integer)session.getAttribute("count");
		     System.out.println("after sssion created "+count);
		     String m_prevbutton=request.getParameter("button");
		     System.out.println(m_prevbutton);
				    
		     ArrayList<Question>aList=(ArrayList<Question>)session.getAttribute("question");
		     if(m_prevbutton.equals("Prev") && count>0){
                    count--;
		    	    getPrevious(out,count,aList,session);
   	   }
		     else {//for next
	
		   /*  if(count == null )
	{
	         count=1;
	         System.out.println("in post 1 "+count);
    }*/
	      	 session.setAttribute("count", count);
		   //  System.out.println("in post 2 "+count);
		     String m_qid=request.getParameter("questionid");
		      String  m_option=request.getParameter("option");             
		    String  m_values[]=request.getParameterValues("option1");

		    String res="";
		    if(m_values != null ){
		    	for(String v:m_values){
		    		
		            res+=v+","; 		
		       //     System.out.println("m_values test");
		    	}
		   
		    }
		 	
		     
		     Map<String,String>ansMap=(Map)session.getAttribute("answers");//answers from user
			 if(ansMap ==null)
	{
			 ansMap=new HashMap<String, String>(); 
    	}
	        if(m_values !=null){
	        	String m_option1=res.substring(0,(res.length()-1));
	        	ansMap.put(m_qid, m_option1);
	        }else{
			 ansMap.put(m_qid, m_option);
	        }
			 session.setAttribute("answers", ansMap);
			 System.out.println(ansMap);
			 if(aList != null)
			 createPage(out, aList,  count, session);
		}
	}//for next
}














/*

void createPage(PrintWriter out,LinkedHashMap<Question,String[]> xList, int count,HttpSession session){
	    int i=0;


//int count1= (Integer)session.getAttribute("count");
if(count == 10){
	out.println("<html><body>");
	 out.println("<form action='ResultDemo' method='post' >");
	 out.println("<tr><td><input type='submit' value='Finish'></td></tr>");
	 out.println("</form></body></html>");
	
}
else	{
//	 String option="option"+i;
	out.println("<html><body>");
	Set<Question> keys=null;  
	Iterator<Question>itr=null;
	if(count==0){
	   keys=xList.keySet();
	   itr=keys.iterator();
      } 
	  
      if(itr.hasNext()){
    	  Question Q= itr.next();
		out.println("<form action='PaperGeneration' method='post' >");
		           //    Question q=    aList.get(count);   
		     out.println("<table>");
		    
		     out.println("<tr><td>Q "+(count+1)+Q.getQuestion()+"</td></tr>" );
		   
		     String choice[]=xList.get(Q);
		   For Question having Radio Button
		  
		   
		   if(Q.getSelection().equals("R"))
             { 
              out.println("<td><input type='radio' name='option' value='"+choice[0]+"'>"+choice[0]+"</td></tr>"); 
			  out.println("<td><input type='radio' name='option'  value='"+choice[1]+"' >"+choice[1]+"</td></tr>");
			  out.println("<td><input type='radio' name='option'  value='"+choice[2]+"' >"+choice[2]+"</td></tr>"); 
			  out.println("<td><input type='radio' name='option'  value='"+choice[3]+"'>"+choice[3]+"</td></tr>");
		     }
		 
		  
		  For CheckBox  
		  
		  
		  else if(Q.getSelection().equals("C")){
			  out.println("<td><input type='checkbox' name='option1' value='"+choice[0]+"' >"+choice[0]+"</td></tr>"); 
			  out.println("<td><input type='checkbox' name='option1'  value='"+choice[1]+"' >"+choice[1]+"</td></tr>");
			  out.println("<td><input type='checkbox' name='option1'  value='"+choice[2]+"' >"+choice[2]+"</td></tr>"); 
			  out.println("<td><input type='checkbox' name='option1'  value='"+choice[3]+"'>"+choice[3]+"</td></tr>");	  
		     }
		     count=count+1;
		     session.setAttribute("count", count);
		//     System.out.println("test "+count);
		     out.println("<tr><td><input type='hidden' name='questionid' value='"+Q.getQuestion_id()+"'></td></tr>");
             out.println("<tr><td><input type='submit' value='Next'></td></tr>");
		     i++;
		     out.println("</form></body></html>");
      }       
      }

             }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out=response.getWriter();
    HttpSession session = request.getSession();
	   Integer count=(Integer) request.getAttribute("count");
	   session.setAttribute("count", count);
       QuestionPaperService qService= new QuestionPaperServiceImpl();
   
	    LinkedHashMap<Question,String[]>aList=( LinkedHashMap<Question,String[]>)session.getAttribute("questions");  
	   if (count==null && aList==null){
    count=0;
  //  System.out.println("in get "+count);
   
     session.setAttribute("question", aList);
	 //  LinkedHashMap<Question, String[]> hMap = null;
	   LinkedHashMap<Question, String[] >qMap=qService.getQuestionPaper("java", "1");	
	   createPage(out,qMap , count, session);
	   }
	   //   createPage(out,qMap, count, session);
	    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     PrintWriter out= response.getWriter();
     HttpSession session = request.getSession(false);
   //  System.out.println(session.isNew());
     Integer count=(Integer)session.getAttribute("count");
     //System.out.println("after sssion created "+count);
     LinkedHashMap<Question,String[]>aList=(LinkedHashMap<Question,String[]>)session.getAttribute("question");
     if(count == null )
{
    count=1;
   // System.out.println("in post 1 "+count);
}
 	 session.setAttribute("count", count);
   //  System.out.println("in post 2 "+count);
     String m_qid=request.getParameter("questionid");
      String  m_option=request.getParameter("option");             
    String  m_values[]=request.getParameterValues("option1");

    String res="";
    if(m_values != null ){
    	for(String v:m_values){
    		
            res+=v+","; 		
       //     System.out.println("m_values test");
    	}
   
    }
 	
     
     Map<String,String>ansMap=(Map)session.getAttribute("answers");//answers from user
	 if(ansMap ==null)
{
	 ansMap=new HashMap<String, String>(); 
}
   if(m_values !=null){
   	String m_option1=res.substring(0,(res.length()-1));
   	ansMap.put(m_qid, m_option1);
   }else{
	 ansMap.put(m_qid, m_option);
   }
	 session.setAttribute("answers", ansMap);
	 System.out.println(ansMap);
	 QuestionPaperService qService= new QuestionPaperServiceImpl();
	 LinkedHashMap<Question, String[] >qMap=qService.getQuestionPaper("java", "1");
	 if(aList != null)
	 createPage(out, qMap,  count, session);
}*/