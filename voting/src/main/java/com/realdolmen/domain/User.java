package com.realdolmen.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

	private String name;
	private Candidate candidate;

	private List<Answer> answers = new ArrayList<>();

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public void addAnswer(Answer answer) {
		this.answers.add(answer);
	}

	public Candidate getCandidateToVoteFor() {
		Map<Candidate, Integer> voteMap = new HashMap<>();
		
		Candidate candidate = null;
		
		// Over antwoorden lijst lopen en bijhouden in 'voteMap' welke kandidaat
		// het meeste antwoorden heeft

		for (Answer answer : answers) {
			candidate = answer.getCandidate();
			if (voteMap.containsKey(candidate)) {
				Integer previeusScore = voteMap.get(candidate);
				voteMap.put(candidate, previeusScore + 1);
			} else {
				voteMap.put(candidate, 0);
			}
		}
		Integer maxScore = Integer.MIN_VALUE;
		Integer candidateScore;
		
		// De 'voteMap' overlopen om zo te bepalen welke candidaat de hoogste score heeft
		for(Map.Entry<Candidate, Integer> entry : voteMap.entrySet()) {
			candidateScore = entry.getValue();
			if(candidateScore > maxScore){
				maxScore = candidateScore;
				candidate = entry.getKey();
			}
		}
		
		return candidate;

	}

}
