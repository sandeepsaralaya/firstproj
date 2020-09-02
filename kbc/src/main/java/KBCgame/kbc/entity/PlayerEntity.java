package KBCgame.kbc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class PlayerEntity {
	@Id
	@Column(name="emailID")
    private String pEmailId; 
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="PEMAILID")
	private List<HistoryEntity> historyEntity;
	
	@Column(name="PName")
	private String pName;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpEmailId() {
		return pEmailId;
	}
	public void setpEmailId(String pEmailId) {
		this.pEmailId = pEmailId;
	}
	public List<HistoryEntity> getHistory() {
		return historyEntity;
	}
	public void setHistory(List<HistoryEntity> historyEntity) {
		this.historyEntity = historyEntity;
	}
	
	
	

}
