package Java.Spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("Java/Spring/Aop/paymentconfig.xml");
    	PaymentMethod pm = (PaymentMethod) ac.getBean("paymenttest");
    	pm.payment();
    }
}
