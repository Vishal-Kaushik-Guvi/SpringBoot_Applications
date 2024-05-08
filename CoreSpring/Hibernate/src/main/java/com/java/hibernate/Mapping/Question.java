package com.java.hibernate.Mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Column(name = "Question")
    private String Ques;
	@Column(name = "QuestionID")
	@Id
    private int QuesId;
	
	@OneToOne
    private Answer ans;

	public String getQues() {
		return Ques;
	}

	public void setQues(String question) {
		Ques = question;
	}

	public int getQuesId() {
		return QuesId;
	}

	public void setQuesId(int quesId) {
		QuesId = quesId;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [Ques=" + Ques + ", QuesId=" + QuesId + ", ans=" + ans + "]";
	}
	
	
    
    
    
	
}
