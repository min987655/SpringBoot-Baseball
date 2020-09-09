package com.cos.baseball.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonRespDto<T> {
	private int statusCode; // 1정상, -1실패, 0변경안됨
	private T data;	
}
