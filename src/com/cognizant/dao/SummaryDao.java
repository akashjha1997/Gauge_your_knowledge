package com.cognizant.dao;

import java.util.ArrayList;
import com.cognizant.model.Assessment;

public interface SummaryDao {
	
	public ArrayList<Assessment> getSummary(String userid);

}
