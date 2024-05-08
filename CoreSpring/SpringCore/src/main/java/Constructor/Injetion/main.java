package Constructor.Injetion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
            
		ApplicationContext ac = new ClassPathXmlApplicationContext("Constructor/Injetion/Person.xml");
         Person p = (Person) ac.getBean("person");
         System.out.println(p);
	}

}
