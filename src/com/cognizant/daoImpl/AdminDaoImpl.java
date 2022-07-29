package com.cognizant.daoImpl;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.io.PrintWriter;
import java.sql.Connection;
import com.cognizant.model.Question;
import com.cognizant.util.JdbcConnection;
import com.cognizant.dao.AdminDao;



public class AdminDaoImpl implements AdminDao {


	

/*INSERT FUNCTION*/



	public boolean insert(Question question) {
		// TODO Auto-generated method stub
		

			Connection con =null;

			PreparedStatement ps=null;

			con=JdbcConnection.getConnection();

			

			String query="insert into question values(?,?,?,?,?,?,?,?,?,?,?,?)";

		try {

			ps=con.prepareStatement(query);

		int 	marks=1;

			ps.setString(1, question.getQuestion_id());

			ps.setString(2, question.getQuestion_creator());

			ps.setString(3, question.getQuestion());

		    ps.setString(4, question.getChoice1());

			ps.setString(5, question.getChoice2());

			ps.setString(6, question.getChoice3());	
			
			ps.setString(7, question.getChoice4());
			
			ps.setString(8, question.getSelection());
		
			ps.setString(9, question.getSkillSet());
			
			ps.setString(10, question.getCompetencyLevel());
			
			ps.setInt(11, marks);
			
			ps.setString(12, question.getAnswer());
			
			int rs=ps.executeUpdate();

			if(rs>0){

				return true;

			}

			

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
          }

		finally{

			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

			}
		
		
		
		
		return false;
	}

	
	/*DELETE FUNCTION*/
	

	public boolean deleteQuestion(String question) {

		
		Connection con=null;
        con=JdbcConnection.getConnection();
        String query="delete from question where questionid=?";
        try {
                    PreparedStatement pst=con.prepareStatement(query);
                    pst.setString(1,question);
                  
                    int rs=pst.executeUpdate();
                      if(rs>0){
                    	 System.out.println("data removed sucessfully");
                         return true;
                      }
                      else{
                    	  return false;
                      }
                                
                
        } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
        }

	finally{

		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		return false;
		
	//	return false;
	}
/*public static void main(String[] args) {
	deleteQuestion();
}*/

	/*UPDATE FUNCTION*/
	
	
	public  boolean updateQuestion(Question question) {
		// TODO Auto-generated method stub
		Connection con=null;
        con=JdbcConnection.getConnection();
      //  question= new Question("q4", "def", "test question", "aaa", "bbbb", "cccc","dddd", "R","java","1",1,"aaa");
       String query="update question set questioncreator=?,question=?,choice1=?,choice2=?,choice3=?,choice4=?,selection=?,skillset=?,competencylevel=?,marks=?,answer=? where questionid=?";
     //   String query="update question set questioncreator=? where questionid=?";
        try {
			PreparedStatement pst=con.prepareStatement(query);
		
			int m=1;
			pst.setString(1, question.getQuestion_creator());
			System.out.println("t1");
			pst.setString(2, question.getQuestion());

		    pst.setString(3, question.getChoice1());

			pst.setString(4, question.getChoice2());

			pst.setString(5, question.getChoice3());	
			
			pst.setString(6, question.getChoice4());
			
			pst.setString(7, question.getSelection());

			pst.setString(8, question.getSkillSet());
			
			pst.setString(9, question.getCompetencyLevel());
			
			pst.setInt(10, m);
			
			pst.setString(11, question.getAnswer());
			pst.setString(12,question.getQuestion_id());
			int rs=pst.executeUpdate();
			if(rs>=1){
			System.out.println("rows affect "+rs);
			System.out.println("data updated sucessfully");
            return true;			
			}
			else{
				System.out.println("not exectuted");
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally{

    		try {
    			con.close();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

    	}
    		return false;
    		
	}
	public static void main(String args[]){
		AdminDaoImpl al= new AdminDaoImpl();
		System.out.println(al.updateQuestion(new Question()));
	}
		
	
	}
	


