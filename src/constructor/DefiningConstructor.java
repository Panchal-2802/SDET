package constructor;

public class DefiningConstructor {
	int a,b;
	DefiningConstructor() {
		a=100;
		b=100;
	}
	void valueOfvariable() {
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
	}
	DefiningConstructor(int x, int y){
		a=x;
		b=y;
	}
	void PrintValue() {
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
