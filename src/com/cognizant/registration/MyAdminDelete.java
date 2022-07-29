package com.cognizant.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.AdminDao;
import com.cognizant.daoImpl.AdminDaoImpl;

public class MyAdminDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public MyAdminDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		//AdminService ads=new AdminServiceImpl();
		String m_question_id=request.getParameter("Question_id");
		System.out.println(m_question_id);
		AdminDao adao=new AdminDaoImpl();
		
	//	boolean flag=true;
		
				if(adao.deleteQuestion(m_question_id))
				{
		//System.out.println(flag);
		   
					
					 out.write("\r\n");
				      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
				      out.write("<html>\r\n");
				      out.write("<head>\r\n");
				      out.write("<h1>Question deleted sucessfully</h1>\r\n");
				      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
				      out.write("<title>DELETED SUCCESS</title>\r\n");
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
					
					
					
			
			System.out.println("Question deleted sucessfully");
		}
		else{
			System.out.println("QUESTION ID NOT FOUND"+m_question_id);
			out.write("\r\n");
		      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
		      out.write("<html>\r\n");
		      out.write("<head>\r\n");
		      out.write("<h1>QUESTION WITH THIS ID DOES NOT EXIST</h1>\r\n");
		      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
		      out.write("<title>Error Delete</title>\r\n");
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


