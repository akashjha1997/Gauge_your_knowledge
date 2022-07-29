package com.cognizant.service;

import com.cognizant.model.Question;

public interface AdminService {
	public boolean insertQuestion(Question question);
	public boolean deleteQuestion(String questionid);
}
