package Test.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Test/SpringCore/Test.xml");
		TestInter t = (TestInter) ac.getBean("src");
		t.walk();

	}

}
