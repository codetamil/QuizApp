package com.pack;

public class Answer {
	private int id;
	private String answerText;
	private String correctAnswer;
	private Question question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerText=" + answerText + ", correctAnswer=" + correctAnswer + ", question="
				+ question + "]";
	}
	
	
	
	
	


}
