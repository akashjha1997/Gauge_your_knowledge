package com.cognizant.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


import com.cognizant.dao.SummaryDao;
import com.cognizant.model.Assessment;
import com.cognizant.util.JdbcConnection;

public class SummaryDaoImpl implements SummaryDao {

	public ArrayList<Assessment> getSummary(String userid) {
		
/*
		Connection con =null;
		PreparedStatement ps=null;
		con=JdbcConnection.getConnection();
		
		String query="Select * from assessment where user_id=?";
		ArrayList <Assessment> aList=null;
	try {
		ps=con.prepareStatement(query);
		
		ps.setString(1,userid);
		
	    ResultSet rs=ps.executeQuery();
	 
	    while(rs.next()){
	    	String user_id=rs.getString(1);
	    	String examid=rs.getString(2);
	    	String examDescription=rs.getString(3);
	    	String clevel=rs.getString(4);
	    	int aid=rs.getInt(5);
	    	Date stime=rs.getDate(6);
	    	Date etime=rs.getDate(7);
	    	int score=rs.getInt(8);
	    	Assessment assessment=new Assessment(user_id, examid, examDescription, clevel, aid, stime, etime, score);
	    	aList.add(assessment);
	    }
		return aList;
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
		
		
		
		
	}


	
	
	
	
	
	
	
	
	*/
	
	Connection con=null;
	con=JdbcConnection.getConnection();
	String query="Select * from assessment where user_id=?";
	ArrayList <Assessment> aList=null;
	try {
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,userid);
		ResultSet rs=pst.executeQuery();
		aList=new ArrayList<Assessment>();
	    while(rs.next()){
	    	String user_id=rs.getString(1);
	    	String examid=rs.getString(2);
	    	String examDescription=rs.getString(3);
	    	String clevel=rs.getString(4);
	    	int aid=rs.getInt(5);
	    	String stime=rs.getString(6);
	    	String  etime=rs.getString(7);
	    	int score=rs.getInt(8);
	    	Assessment assessment=new Assessment(user_id, examid, examDescription, clevel, aid, stime, etime, score);
	    	aList.add(assessment);
	    } 
	  return aList;  
	}catch (SQLException e) {
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
	
	return null;
}

}
