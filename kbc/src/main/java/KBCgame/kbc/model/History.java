package KBCgame.kbc.model;

import java.time.LocalDateTime;



public class History {
	private Integer hId;
	private LocalDateTime sessionTime;
	private String score;
	
	public Integer gethId() {
		return hId;
	}
	public void sethId(Integer hId) {
		this.hId = hId;
	}
	public LocalDateTime getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(LocalDateTime sessionTime) {
		this.sessionTime = sessionTime;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	
}
