package com.cognizant.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.model.Question;
import com.cognizant.service.AdminService;
import com.cognizant.serviceimpl.AdminServiceImpl;

/**
 * Servlet implementation class MyAdminInsert
 */
public class MyAdminInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyAdminInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		AdminService ads=new AdminServiceImpl();
		String m_question_id=request.getParameter("Question_id");
		String m_question_creator=request.getParameter("Question_creator");
		String m_question=request.getParameter("Question");
		String m_choice1=request.getParameter("Choice1");
		String m_choice2=request.getParameter("Choice2");
		String m_choice3=request.getParameter("Choice3");
		String m_choice4=request.getParameter("Choice4");
	
		String m_selection=request.getParameter("Selection");
		String m_skillset=request.getParameter("SkillSet");
		String m_competencylevel=request.getParameter("CompetencyLevel");
		//int m_marks=Integer.parseInt(request.getParameter("Mark"));
		String m_answer=request.getParameter("Answer");
		System.out.println(m_question_id);
		System.out.print(m_selection);
		System.out.println(m_choice1);
		System.out.println(m_choice2);
		System.out.println(m_choice3);
		System.out.println(m_choice4);
		Question rModel=new Question(m_question_id,m_question_creator,m_question,m_choice1,m_choice2,m_choice3,m_choice4,m_selection,m_skillset,m_competencylevel,m_answer);
		
		if(ads.insertQuestion(rModel)){

			 out.write("\r\n");
		      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
		      out.write("<html>\r\n");
		      out.write("<head>\r\n");
		      out.write("<h1>QUESTION WITH THIS ID IS INSERTED</h1>\r\n");
		      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
		      out.write("<title>Success Inserted</title>\r\n");
		      out.write("<style type=\"text/css\">\r\n");
		      out.write("\r\n");
		      out.write(".btn {\r\n");
		      out.write("\r\n");
		      out.write("  background-color: transparent;\r\n");
		      out.write("  border: 3px solid black;\r\n");
		      out.write("  color: black;\r\n");
		      out.write("  padding: 15px 20px;\r\n");
		      out.write("  cursor: pointer;\r\n");
		      out.write("  width: 320px;\r\n");
		      out.write("  opacity: 0.9;\r\n");
		      out.write("  margin-left: 17px\r\n");
		      out.write("}\r\n");
		      out.write("\r\n");
		      out.write(".btn:hover {\r\n");
		      out.write("color:black;\r\n");
		      out.write("  opacity: 1;\r\n");
		      out.write("}\r\n");
		      out.write("\r\n");
		      out.write("</style>\r\n");
		      out.write("</head>\r\n");
		      out.write("<body>\r\n");
		      out.write("<form action=\"admindashboard.jsp\">\r\n");
		      out.write("<input type=\"submit\" value=\"Admin DashBoard\" class=\"btn\" >\r\n");
		      out.write("</form>\r\n");
		      out.write("<form action=\"Logout\">\r\n");
		      out.write("<input type=\"submit\" value=\"Logout\" class=\"btn\" >\r\n");
		      out.write("</form>\r\n");
		      out.write("\r\n");
		      out.write("\r\n");
		      out.write("</body>\r\n");
		      out.write("</html>");

		                                             }





		else{
			System.out.println("QUESTION ID NOT FOUND"+m_question_id);
			out.write("\r\n");
		      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
		      out.write("<html>\r\n");
		      out.write("<head>\r\n");
		      out.write("<h1>QUESTION WITH THIS ID IS NOT INSERTED</h1>\r\n");
		      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
		      out.write("<title>Error Insert</title>\r\n");
		      out.write("<style type=\"text/css\">\r\n");
		      out.write("\r\n");
		      out.write(".btn {\r\n");
		      out.write("\r\n");
		      out.write("  background-color: transparent;\r\n");
		      out.write("  border: 3px solid black;\r\n");
		      out.write("  color: black;\r\n");
		      out.write("  padding: 15px 20px;\r\n");
		      out.write("  cursor: pointer;\r\n");
		      out.write("  width: 320px;\r\n");
		      out.write("  opacity: 0.9;\r\n");
		      out.write("  margin-left: 17px\r\n");
		      out.write("}\r\n");
		      out.write("\r\n");
		      out.write(".btn:hover {\r\n");
		      out.write("color:black;\r\n");
		      out.write("  opacity: 1;\r\n");
		      out.write("}\r\n");
		      out.write("\r\n");
		      out.write("</style>\r\n");
		      out.write("</head>\r\n");
		      out.write("<body>\r\n");
		      out.write("<form action=\"admindashboard.jsp\">\r\n");
		      out.write("<input type=\"submit\" value=\"Admin DashBoard\" class=\"btn\" >\r\n");
		      out.write("</form>\r\n");
		      out.write("</form>\r\n");
		      out.write("<form action=\"Logout\">\r\n");
		      out.write("<input type=\"submit\" value=\"Logout\" class=\"btn\" >\r\n");
		      out.write("</form>\r\n");
		      out.write("\r\n");
		      out.write("\r\n");
		      out.write("</body>\r\n");
		      out.write("</html>");

		}
		
		
	}
	}

