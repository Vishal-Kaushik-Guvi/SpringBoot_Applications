package Constructor.Injetion;

public class Person {
    private int PersonId;
    private String PersonName;
    
    public Person(int PersonID, String PersonName) {
    	this.PersonId = PersonID;
    	this.PersonName = PersonName;
    }

	@Override
	public String toString() {
		return "PersonId= " + PersonId + ", PersonName= " + PersonName + "";
	}
    
}
