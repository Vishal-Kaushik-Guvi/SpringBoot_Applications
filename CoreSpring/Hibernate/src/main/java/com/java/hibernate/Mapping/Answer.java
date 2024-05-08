package com.java.hibernate.Mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	@Column(name= "Answer")
  private String Answ;
	@Column(name ="AnswerId")
	@Id
  private int AnsId;
	
	public String getAnsw() {
		return Answ;
	}
	public void setAnsw(String answer) {
		Answ = answer;
	}
	public int getAnsId() {
		return AnsId;
	}
	public void setAnsId(int ansId) {
		AnsId = ansId;
	}
	
	@Override
	public String toString() {
		return "Answer [Answ=" + Answ + ", AnsId=" + AnsId + "]";
	}
	
	
  
  
}
