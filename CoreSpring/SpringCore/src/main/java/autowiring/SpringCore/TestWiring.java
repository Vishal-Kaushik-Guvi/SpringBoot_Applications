package autowiring.SpringCore;

public class TestWiring {
    private TestClass tclass;

	public TestClass getTclass() {
		return tclass;
	}

	public void setTclass(TestClass tclass) {
		this.tclass = tclass;
	}

	public TestWiring(TestClass tclass) {
		super();
		this.tclass = tclass;
	}

	public TestWiring() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestWiring [tclass=" + tclass + "]";
	}
	
}
