package com.cos.baseball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.model.Stadium;
import com.cos.baseball.model.Team;
import com.cos.baseball.repository.StadiumRepository;
import com.cos.baseball.repository.TeamRepository;

@Service // IoC
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository; // DI
	
	// 커밋이 필요하기 때문에 트랜잭션 타야 함
	@Transactional
	public void 팀등록(Team team){
		teamRepository.save(team);
	}
	
	@Transactional(readOnly = true)
	public List<Team> 목록보기(){
		return teamRepository.findAll();
	}
	
	
}
