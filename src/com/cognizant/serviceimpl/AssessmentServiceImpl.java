package com.cognizant.serviceimpl;

import com.cognizant.dao.AssessmentDao;
import com.cognizant.daoImpl.AssessmentDaoImpl;
import com.cognizant.model.Assessment;
import com.cognizant.service.AssessmentService;

public class AssessmentServiceImpl implements AssessmentService{

	public boolean insertAssessment(Assessment assessment) {
		AssessmentDao aDao=new AssessmentDaoImpl();
		return aDao.insert(assessment);
	}

	public int getAid() {
		AssessmentDao aDao=new AssessmentDaoImpl();
		return aDao.getAssessmentid();
	}

}
