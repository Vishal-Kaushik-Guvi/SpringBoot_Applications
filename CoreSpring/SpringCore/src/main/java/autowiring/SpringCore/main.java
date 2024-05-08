package autowiring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
       ApplicationContext ac = new ClassPathXmlApplicationContext("autowiring/SpringCore/Wirring.xml");
       TestWiring tw = (TestWiring) ac.getBean("testwire");
       
       System.out.println(tw);
    }
}
