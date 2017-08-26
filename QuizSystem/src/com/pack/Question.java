package com.pack;

//model class
public class Question {
	
	//instance Variables
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	private String questionType;
	private String questionText;
	private Boolean isActive;
	@Override
	public String toString() {
		return "Question [id=" + id + ", questionType=" + questionType + ", questionText=" + questionText
				+ ", isActive=" + isActive + "]";
	}
	
	
	
	

}
