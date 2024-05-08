package Java.Spring.Aop.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@After("execution(* Java.Spring.Aop.Aspect.PaymentImpliment.payment())")
          public void paymentBefore() {
        	  System.out.println("Payment Started...");
          }
}
