package SpringCore.CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private int Emp_id;
private List<String> Emp_Work;
private Set<String> Emp_FamilyMembers;
private Map<Integer, String> Emp_Name;

public int getEmp_id() {
	return Emp_id;
}
public void setEmp_id(int emp_id) {
	Emp_id = emp_id;
}
public List<String> getEmp_Work() {
	return Emp_Work;
}
public void setEmp_Work(List<String> emp_Work) {
	Emp_Work = emp_Work;
}
public Set<String> getEmp_FamilyMembers() {
	return Emp_FamilyMembers;
}
public void setEmp_FamilyMembers(Set<String> emp_FamilyMembers) {
	Emp_FamilyMembers = emp_FamilyMembers;
}
public Map<Integer, String> getEmp_Name() {
	return Emp_Name;
}
public void setEmp_Name(Map<Integer, String> emp_Name) {
	Emp_Name = emp_Name;
}

public Employee(int emp_id, List<String> emp_Work, Set<String> emp_FamilyMembers, Map<Integer, String> emp_Name) {
	super();
	Emp_id = emp_id;
	Emp_Work = emp_Work;
	Emp_FamilyMembers = emp_FamilyMembers;
	Emp_Name = emp_Name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


}
