package com.cos.baseball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.model.Stadium;
import com.cos.baseball.repository.StadiumRepository;

@Service // IoC
public class StadiumService {
	
	@Autowired
	private StadiumRepository stadiumRepository; // DI
	
	// 커밋이 필요하기 때문에 트랜잭션 타야 함
	@Transactional
	public void 야구장등록(Stadium stadium){
		System.out.println("StadiumService : 야구장등록 : " + stadium.getStadiumname());
		stadiumRepository.save(stadium);
	}
	
	@Transactional(readOnly = true)
	public List<Stadium> 목록보기(){
		return stadiumRepository.findAll();
	}
	
	
}
