package com.realdolmen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.realdolmen.domain.Answer;
import com.realdolmen.domain.Candidate;
import com.realdolmen.domain.Question;
import com.realdolmen.domain.User;

@ManagedBean
@ApplicationScoped
public class QuestionsBean {

	private List<Question> questions = new ArrayList<Question>();
	private User user;
	
	@PostConstruct
	public void initialize(){
		user = new User();
		Candidate clinton = new Candidate("Clinton");
		Candidate trump = new Candidate("Trump");
		
		Question q1 = new Question("Should we keep the American borders closed?",1.00);
		Answer q1a1 = new Answer("Yes, we should build a wall at the mexican border",trump);
		Answer q1a2 = new Answer("No, we should build a plan for legalization of illegal immigrants",clinton);
		q1.addAnswer(q1a1);
		q1.addAnswer(q1a2);
		
		Question q2 = new Question("What do you think of Obamacare?",1.00);
		Answer q2a1 = new Answer("Expand it",clinton);
		Answer q2a2 = new Answer("Get rid of it",trump);
		q2.addAnswer(q2a1);
		q2.addAnswer(q2a2);
		
		Question q3 = new Question("What's your opinion on abortion?",1.00);
		Answer q3a1 = new Answer("Pro",clinton);
		Answer q3a2 = new Answer("Only in case of rape or incest, etc...",trump);
		q3.addAnswer(q3a1);
		q3.addAnswer(q3a2);
		
		Question q4 = new Question("What's your opinion on taxes on high-income earners?",1.00);
		Answer q4a1 = new Answer("Contra",trump);
		Answer q4a2 = new Answer("Pro",clinton);
		q4.addAnswer(q4a1);
		q4.addAnswer(q4a2);
		
		Question q5 = new Question("Minimum wage must be set by?",1.00);
		Answer q5a1 = new Answer("Nationwide",clinton);
		Answer q5a2 = new Answer("Must be set by the states",trump);
		q5.addAnswer(q5a1);
		q5.addAnswer(q5a2);
		
		Question q6 = new Question("What's your position on marijuana?",1.00);
		Answer q6a1 = new Answer("Only for medicinal purpose",trump);
		Answer q6a2 = new Answer("Don't legalize it, but should be less restricted as it is now",clinton);
		q6.addAnswer(q6a1);
		q6.addAnswer(q6a2);
		
		Question q7 = new Question("What's your position on Syria?",1.00);
		Answer q7a2 = new Answer("No boots on the ground",trump);
		Answer q7a1 = new Answer("No fly zone, and training Syrian rebels",clinton);
		q7.addAnswer(q7a1);
		q7.addAnswer(q7a2);
		
		Question q8 = new Question("Which religion do you prefer?",1.00);
		Answer q8a2 = new Answer("Protestant",trump);
		Answer q8a1 = new Answer("Christian",clinton);
		q8.addAnswer(q8a1);
		q8.addAnswer(q8a2);
		
		Question q9 = new Question("What's your position on Iran?",1.00);
		Answer q9a1 = new Answer("In favor of an agreement",clinton);
		Answer q9a2 = new Answer("Reject the agreement",trump);
		q9.addAnswer(q9a1);
		q9.addAnswer(q9a2);
		
		Question q10 = new Question("Global warming, what's that all about?",1.00);
		Answer q10a1 = new Answer("I Support a mandatory cap-and-trade system to reduce carbon emissions 80% below 1990 levels by 2050",clinton);
		Answer q10a2 = new Answer("That's created by the Chinese, to make the US non-competitive manufacturers",trump);
		q10.addAnswer(q10a1);
		q10.addAnswer(q10a2);
		
		Question q11 = new Question("What's your opinion on death penalty?",1.00);
		Answer q11a1 = new Answer("I support deathpenalty in certain cases",clinton);
		Answer q11a2 = new Answer("I support deathpenalty for all those who kill police officers",trump);
		q11.addAnswer(q11a1);
		q11.addAnswer(q11a2);
		
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		questions.add(q9);
		questions.add(q10);
		questions.add(q11);
		
	}
	
	public Question getQuestion(int index){
		return questions.get(index);
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public User getUser(){
		return user;
	}

}
