package polymorphism;

public class OverloadMainMethod {
void main() {
	System.out.println();
}

void main(int x, int y) {
	System.out.println(x+y);
}
	public static void main(String[] args) {
		OverloadMainMethod obj1 = new OverloadMainMethod();
		obj1.main(10, 20);

	}

}
