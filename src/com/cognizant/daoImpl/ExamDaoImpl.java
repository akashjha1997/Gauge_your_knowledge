package com.cognizant.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cognizant.dao.ExamDao;
import com.cognizant.model.Exam;

import com.cognizant.util.JdbcConnection;

public class ExamDaoImpl implements ExamDao {

	
	public boolean insert(Exam exam) {
		Connection con =null;
		PreparedStatement ps=null;
		con=JdbcConnection.getConnection();
		
		String query="insert into exam values(?,?,?,?,?)";
	try {
		ps=con.prepareStatement(query);
		
		ps.setString(1, exam.getExamid());
		ps.setString(2, exam.getExamdescription());
		ps.setString(3, exam.getSkillset());
	    ps.setString(4, exam.getCompetencylevel());
		ps.setString(5, exam.getUserid());

		
		
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

	
	
}
