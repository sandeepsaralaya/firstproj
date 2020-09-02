package KBCgame.kbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class AnswerEntity {

	@Id
	@Column(name="AID")
	private Integer aId;
	
	@Column(name="ANS")
	private String ans;
	
	@Column(name="OP1")
	private String op1;
	
	@Column(name="OP2")
	private String op2;
	
	@Column(name="OP3")
	private String op3;
	
	@Column(name="SCORE")
	private String score;
	
	

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	
	
	
}
