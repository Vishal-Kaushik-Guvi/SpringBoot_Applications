package autowiring.SpringCore;

public class TestClass {
  private String Name;
  private String City;
  
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public TestClass(String name, String city) {
	super();
	Name = name;
	City = city;
}
public TestClass() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "TestClass [Name=" + Name + ", City=" + City + "]";
}
  
  
}
