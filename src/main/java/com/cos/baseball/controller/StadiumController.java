package com.cos.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball.controller.dto.CommonRespDto;
import com.cos.baseball.model.Stadium;
import com.cos.baseball.service.StadiumService;

@Controller
public class StadiumController {

	@Autowired
	private StadiumService stadiumService; 
	
	@GetMapping("/stadium/list")
	public String getStadium(Model model) {
		model.addAttribute("stadiumList", stadiumService.목록보기());
		return "stadium/stadiumList";
	}
		
	@GetMapping("/stadium/save")
	public String saveStadium() {
		return "stadium/stadiumSaveForm";
	}
	
//	응답을 데이터로 하기 위해서 @ResponseBody 작성
//	User user로는 키=밸뉴 만 받기 때문에(스프링 기본 전략은 form으로 데이터 주고받음) @RequestBody 붙여서 오브젝트 받음  
	@PostMapping("/stadium/saveProc")
	public @ResponseBody CommonRespDto<?> saveProc(@RequestBody Stadium stadium) {
		System.out.println("StadiumController : saveProc : " + stadium);
		stadiumService.야구장등록(stadium);
		return new CommonRespDto<String>(1, "야구장 등록 완료");
	}
}
