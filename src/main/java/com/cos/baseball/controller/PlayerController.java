package com.cos.baseball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

	@GetMapping("/player/list")
	public String stadium() {
		return "player/playerList";
	}
		
	@GetMapping("/player/save")
	public String player() {
		return "player/playerSaveForm";
	}
}
