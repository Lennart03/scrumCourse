package com.realdolmen.scrumTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.realdolmen.domain.Answer;
import com.realdolmen.domain.Candidate;
import com.realdolmen.domain.User;



public class UserTest {

	private User user;
	
	@Before
	public void initTest() {
		user = new User("Test user");
	}
	
	@Test
	public void userCreatedTest() {
		assertNotNull(user);
	}

	@Test
	public void getNameTest() {
		assertEquals("Test user", user.getName());
	}

	@Test
	public void setNameTest() {
		user.setName("Adjusted name");
		assertEquals("Adjusted name", user.getName());
	}
//
//	@Test
//	public void getCandidateTest() {
//
//	}
//
//	@Test
//	public void setCandidateTest() {
//
//	}
//
//	@Test
//	public void addAnswerTest() {
//
//	}

	@Test
	public void candidateToVoteForTest() {
		Answer answer1 = new Answer("answer 1", new Candidate("candidate1"));
		Answer answer2 = new Answer("answer 2", new Candidate("candidate1"));
		Answer answer3 = new Answer("answer 3", new Candidate("candidate2"));
		user.addAnswer(answer1);
		user.addAnswer(answer2);
		user.addAnswer(answer3);
		Candidate candidate = user.getCandidateToVoteFor();
		assertEquals("candidate1", candidate.getName());
	}
}
