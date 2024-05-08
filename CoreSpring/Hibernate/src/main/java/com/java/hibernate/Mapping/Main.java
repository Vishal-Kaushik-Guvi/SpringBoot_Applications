package com.java.hibernate.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
	Configuration config = new Configuration();
	config.configure("com/java/hibernate/config.xml");
	SessionFactory factory = config.buildSessionFactory();
	Session ss = factory.openSession();
	
	Question ques1 =  new Question();
	ques1.setQues("What is India");
	ques1.setQuesId(1);
	
	Question ques2 =  new Question();
	ques2.setQues("What is Pakistan");
	ques2.setQuesId(2);
	
	Answer ans1 = new Answer();
	ans1.setAnsId(10);
	ans1.setAnsw("India is a country");
	
	Answer ans2 = new Answer();
	ans2.setAnsId(20);
	ans2.setAnsw("Pakistan is a terrorist country");
	
	ques2.setAns(ans2);
	ques1.setAns(ans1);
	
	Transaction tx = ss.beginTransaction();
	
	ss.save(ques1);
	ss.save(ans1);
	ss.save(ques2);
	ss.save(ans2);

	tx.commit();
	
	ss.close();
	factory.close();
	}
}
