package core.reff;

public class ClassA {
 private int x;
 private ClassB objB;
 
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public ClassB getObjB() {
	return objB;
}
public void setObjB(ClassB objB) {
	this.objB = objB;
}

public ClassA(int x, ClassB objB) {
	super();
	this.x = x;
	this.objB = objB;
}

public ClassA() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "ClassA [x=" + x + ", objB=" + objB + "]";
}

}
