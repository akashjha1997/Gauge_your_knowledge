package com.cognizant.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cognizant.dao.AssessmentDao;
import com.cognizant.model.Assessment;
import com.cognizant.util.JdbcConnection;

public class AssessmentDaoImpl implements AssessmentDao {

	public boolean insert(Assessment assessment) {
		// TODO Auto-generated method stub
		
		Connection con =null;
		PreparedStatement ps=null;
		con=JdbcConnection.getConnection();
		
		String query="insert into assessment values(?,?,?,?,?,?,?,?)";
	try {
		ps=con.prepareStatement(query);
		
		ps.setString(1, assessment.getUserid());
		ps.setString(2, assessment.getExamid());
		ps.setString(3, assessment.getExamdescription());
	    ps.setString(4, assessment.getCompetencylevel());
		ps.setInt(5, assessment.getAssessmentid());
		/*java.util.Date uStartTime=assessment.getStarttime();
		java.sql.Date sStartTime= new java.sql.Date(uStartTime.getTime());*/
		
		
		ps.setString(6, assessment.getStime());
	
		ps.setString(7, assessment.getEtime());
	
		ps.setInt(8, assessment.getScore());

		
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		return false;
	}
	
	
	
	
	
	
	
	

	public int getAssessmentid() {
		Connection con=null;
		con=JdbcConnection.getConnection();
		String query="select max(ASSESSMENTID) from ASSESSMENT order by ASSESSMENTID";
		PreparedStatement pst=null;
		ResultSet rs=null;
		int idNum=0;
		try {
		pst=con.prepareStatement(query);
		rs=pst.executeQuery();

		rs.next();
		idNum=rs.getInt(1);
		System.out.println("ASSESSMENTid from db : "+idNum);
		idNum=idNum+1;

		System.out.println("ASSESSMENTid after editing : "+idNum);
		//session.setAttribute("sid", eid);



		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		finally{
		if(rs != null){
		try {
		rs.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		if (pst != null){
		try {
		pst.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		} 
		if(con != null){
		try {
		con.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		} 

		return idNum;
	}
	
	/*public static void main(String[] args) {
		
		Connection con = JdbcConnection.getConnection();
		java.util.Date d = new java.util.Date(System.currentTimeMillis());
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy  HH:mm:ss");
		                        
		
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
		default:
			break;
		}
		   
		
		   
		   
		   
		   String ds=cal.get(Calendar.DATE)+"-"+month+"-"+cal.get(Calendar.YEAR)+" "+cal.get(Calendar.HOUR)+"."+cal.get(Calendar.MINUTE)+"."+cal.get(Calendar.SECOND)+" "+AM_PM;
		   System.out.println(cal.get(Calendar.DATE)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR)+" "+cal.get(Calendar.HOUR)+"."+cal.get(Calendar.MINUTE));
	     //String dS=cal.get(Calendar.DATE+"-"+Calendar.get(Calendar.MONTH)+"-");
		//  System.out.println(d);
		//java.sql.Date d1= new java.sql.Date(d.getTime());
		String query="insert into temp values(?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			pst.setString(1, ds);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
*/
}
