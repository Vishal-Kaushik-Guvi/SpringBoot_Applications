package init.Destroy.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
	      ApplicationContext ac = new ClassPathXmlApplicationContext("init/Destroy/SpringCore/Example.xml");
           Example ex = (Example) ac.getBean("example");
           System.out.println(ex);
	}

}
