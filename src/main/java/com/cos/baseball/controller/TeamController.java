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
import com.cos.baseball.model.Team;
import com.cos.baseball.service.StadiumService;
import com.cos.baseball.service.TeamService;

@Controller
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@Autowired
	private StadiumService stadiumService;
	
	@GetMapping("/team/list")
	public String getTeam(Model model) {
		model.addAttribute("teamList", teamService.목록보기());
		return "team/teamList";
	}	
	
	@GetMapping("/team/save")
	public String getTeamName(Model model) {
		model.addAttribute("stadiumList", stadiumService.목록보기());
		return "team/teamSaveForm";
	}
	
	
	@PostMapping("/team/saveProc")
	public @ResponseBody CommonRespDto<?> saveProc(@RequestBody Team team) {
		System.out.println("TeamController : saveProc : " + team);
		teamService.팀등록(team);
		return new CommonRespDto<String>(1, "팀 등록 완료");
	}
}
