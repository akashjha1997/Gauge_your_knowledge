package com.cognizant.serviceimpl;

import com.cognizant.dao.AdminDao;
import com.cognizant.daoImpl.AdminDaoImpl;
import com.cognizant.model.Question;
import com.cognizant.service.AdminService;

public class AdminServiceImpl implements AdminService{


	public boolean insertQuestion(Question question) {
	
		AdminDao ado=new AdminDaoImpl();
		return ado.insert(question);
		
	}


	public boolean deleteQuestion(String questionid) {
	
		
		return false;
	}

}