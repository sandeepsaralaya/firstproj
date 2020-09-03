package KBCgame.kbc.model;

import java.util.List;


public class Player {
	private String pEmailId; 
	private List<History> history;
	private String pName;
	public String getpEmailId() {
		return pEmailId;
	}
	public void setpEmailId(String pEmailId) {
		this.pEmailId = pEmailId;
	}
	public List<History> getHistory() {
		return history;
	}
	public void setHistory(List<History> history) {
		this.history = history;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	
	
}
