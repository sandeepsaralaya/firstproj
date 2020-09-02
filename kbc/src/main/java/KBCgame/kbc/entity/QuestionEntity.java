package KBCgame.kbc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class QuestionEntity {
	
	@Id
	@Column(name="qID")
	private Integer qID;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="QQID",unique=true)
	private AnswerEntity answerEntity;
	

	@Column(name="qp")
	private String qp;

	public Integer getqID() {
		return qID;
	}

	public void setqID(Integer qID) {
		this.qID = qID;
	}

	public String getQp() {
		return qp;
	}

	public void setQp(String qp) {
		this.qp = qp;
	}

	public AnswerEntity getAnswer() {
		return answerEntity;
	}

	public void setAnswer(AnswerEntity answerEntity) {
		this.answerEntity = answerEntity;
	}
	
	

}
