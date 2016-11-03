package com.realdolmen.domain;

public class Answer {
	
	private String answerText;
	private Candidate candidate;
	
	public Answer() {
		super();
	}
	
	public Answer(String answerText, Candidate candidate) {
		super();
		this.answerText = answerText;
		this.candidate = candidate;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public Candidate getCandidate() {
		return candidate;
	}
	
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
}
