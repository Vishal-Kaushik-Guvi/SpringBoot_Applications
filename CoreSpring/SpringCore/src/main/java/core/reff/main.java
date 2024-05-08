package core.reff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		 ApplicationContext ac = new ClassPathXmlApplicationContext("core/reff/Reff.xml");
		 
		 ClassA a = (ClassA) ac.getBean("A");
		 
		 System.out.println(a);

	}

}
