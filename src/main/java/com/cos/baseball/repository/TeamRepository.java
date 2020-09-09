package com.cos.baseball.repository;

import java.util.List;

import com.cos.baseball.model.Team;

//인터페이스로 생성하는 이유 : 매퍼가 임시로 오브젝트로 만들어 메모리에 띄워주기 때문에. 
public interface TeamRepository {
	public void save(Team team);
	public List<Team> findAll();
}
