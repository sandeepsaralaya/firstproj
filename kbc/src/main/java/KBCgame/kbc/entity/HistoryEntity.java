package KBCgame.kbc.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class HistoryEntity {
	@Id
	@Column(name="HID")
	private Integer hId;
	
	@Column(name="SESSIONTIME")
	private LocalDateTime sessionTime;
	
	@Column(name="SCORE")
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
