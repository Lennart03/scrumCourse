package com.realdolmen.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	private String questionText;
	private Double uestionValue;
	private List<Answer> answers = new ArrayList<Answer>();
	
	public String getQuestionText() {
		return questionText;
	}



	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}



	public Double getUestionValue() {
		return uestionValue;
	}



	public void setUestionValue(Double uestionValue) {
		this.uestionValue = uestionValue;
	}



	public Question() {
		super();
	}



	public Question(String questionText, Double uestionValue) {
		super();
		this.questionText = questionText;
		this.uestionValue = uestionValue;
	}



	public List<Answer> getAnswers() {
		return answers;
	}



	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	public void addAnswer(Answer answer){
		answers.add(answer);
	}

}
