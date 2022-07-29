package com.cognizant.model;



public class Assessment {

private String userid;
 private String examid;
 private String examdescription;
 private String competencylevel;
 private int assessmentid;
 private String stime;
 private String  etime;
 private int score;
public Assessment() {
	super();
	// TODO Auto-generated constructor stub
}
public Assessment(String userid, String examid, String examdescription, String competencylevel, int assessmentid,
		String stime, String etime, int score) {
	super();
	this.userid = userid;
	this.examid = examid;
	this.examdescription = examdescription;
	this.competencylevel = competencylevel;
	this.assessmentid = assessmentid;
	this.stime = stime;
	this.etime = etime;
	this.score = score;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getExamid() {
	return examid;
}
public void setExamid(String examid) {
	this.examid = examid;
}
public String getExamdescription() {
	return examdescription;
}
public void setExamdescription(String examdescription) {
	this.examdescription = examdescription;
}
public String getCompetencylevel() {
	return competencylevel;
}
public void setCompetencylevel(String competencylevel) {
	this.competencylevel = competencylevel;
}
public int getAssessmentid() {
	return assessmentid;
}
public void setAssessmentid(int assessmentid) {
	this.assessmentid = assessmentid;
}
public String getStime() {
	return stime;
}
public void setStime(String stime) {
	this.stime = stime;
}
public String getEtime() {
	return etime;
}
public void setEtime(String etime) {
	this.etime = etime;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}


 
}
