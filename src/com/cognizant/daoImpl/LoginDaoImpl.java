package com.cognizant.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.cognizant.dao.LoginDao;
import com.cognizant.util.JdbcConnection;

public class LoginDaoImpl implements LoginDao{

	public boolean validateLogin(String email, String password,String emptype) {
		// TODO Auto-generated method stub
		Connection con=null;
		con=JdbcConnection.getConnection();
		String query="Select email,password  from users where email=? and password=? and emptype=?";
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			pst=con.prepareStatement(query);
			
			pst.setString(1, email);
			pst.setString(2, password);
			pst.setString(3, emptype);
		
			rs=pst.executeQuery();
			
			
			if(rs.next()){
	
				return true;
			}
			
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
		
		
		
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	public String getUserId(String email, String password, String emptype) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		con=JdbcConnection.getConnection();
		String query="Select user_id  from users where email=? and password=? and emptype=?";
		PreparedStatement pst=null;
		ResultSet rs=null;
		String userid=null;
		try {
		pst=con.prepareStatement(query);

		pst.setString(1, email);
		pst.setString(2, password);
		pst.setString(3, emptype);

		rs=pst.executeQuery();


		if(rs.next()){
		userid=rs.getString(1);
		System.out.println("in jsp : "+userid);
		
	
		}

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

		return userid;
	}

	public String getUsername(String email, String password, String emptype) {
		
		Connection con=null;
		con=JdbcConnection.getConnection();
		String query="Select first_name,last_name  from users where email=? and password=? and emptype=?";
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		String name=null;
		try {
		pst=con.prepareStatement(query);

		pst.setString(1, email);
		pst.setString(2, password);
		pst.setString(3, emptype);

		rs=pst.executeQuery();


		if(rs.next()){
	
		String fname=rs.getString(1);
		String lname=rs.getString(2);
		System.out.println(fname);
		System.out.println(lname);
		 name=fname.toUpperCase()+" "+lname.toUpperCase();

		System.out.println("in jsp name : "+name);
		//session.setAttribute("userid", userid);
		//session.setAttribute("name", name);

		}

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

	
		
		return name;
	}

}
