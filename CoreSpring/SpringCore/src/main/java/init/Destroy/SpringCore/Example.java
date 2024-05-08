package init.Destroy.SpringCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
  private String Subject;
  
  public String getSubject() {
	  return Subject;
  }
  
  public void setSubject(String subject) {
	  this.Subject = subject;
  }

public Example(String subject) {
	super();
	Subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@PostConstruct
 public void start() {
   System.out.println("Start Method called ");	 
 }

@PreDestroy
 public void end() {
	 System.out.println("Method Ended ");
 }
 
@Override
public String toString() {
	return "Example [Subject=" + Subject + "]";
}
  
}
