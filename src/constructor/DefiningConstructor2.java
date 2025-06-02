package constructor;

public class DefiningConstructor2 {
	int a,b;
	public DefiningConstructor2() {
		a=100;
		b=100;
	}
public	void valueOfvariable() {
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
	}
public 	DefiningConstructor2(int x, int y){
		a=x;
		b=y;
	}
public	void PrintValue() {
		System.out.println("Print value by parameterised constructor A : " + a);
		System.out.println("Print value by parameterised constructor B : " + b);
	}

	public static void main(String[] args) {
		DefiningConstructor obj1 = new DefiningConstructor();
		obj1.valueOfvariable();
		
		DefiningConstructor obj2 = new DefiningConstructor(50,50);
		obj2.PrintValue();

	}

}
