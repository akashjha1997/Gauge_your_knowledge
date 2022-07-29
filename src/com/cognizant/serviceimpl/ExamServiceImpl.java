package com.cognizant.serviceimpl;

import com.cognizant.dao.ExamDao;
import com.cognizant.daoImpl.ExamDaoImpl;
import com.cognizant.model.Exam;
import com.cognizant.service.ExamService;

public class ExamServiceImpl implements ExamService {

	public boolean insertExam(Exam exam) {
		ExamDao edao=new ExamDaoImpl();
		return edao.insert(exam);
		
		
	}

}
