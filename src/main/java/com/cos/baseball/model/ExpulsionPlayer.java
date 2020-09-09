package com.cos.baseball.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpulsionPlayer {
	private int id;
	private int playerId;
	private String reason;
	private Timestamp createDate;
}
