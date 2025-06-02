package constructor2;
import constructor.DefiningConstructor2;
public class RecallingConstructorFromDifferentPackage {

	public static void main(String[] args) {
		// non - parameterized constructor 
		DefiningConstructor2 obj1 = new DefiningConstructor2();
		obj1.PrintValue();
		
		// parameterized constructor
		DefiningConstructor2 obj2 = new DefiningConstructor2(25,30);
		obj2.valueOfvariable();

	}

}
