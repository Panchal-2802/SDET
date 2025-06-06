package polymorphism;
// purpose of constructor is to assign the data 
public class ConstructorOverloadding {
int a = 10 , b=20, c=10;
ConstructorOverloadding(){
	System.out.println((a+b));
}
ConstructorOverloadding(int x, int y){
	a=x;
	b=y;;
	System.out.println(a + " " + b);
}
ConstructorOverloadding(int x, int y, int z){
	a=x; b=y; c=z;
	System.out.println("volume : " + (a*b*c));
}


	public static void main(String[] args) {
		ConstructorOverloadding obj1 = new ConstructorOverloadding();
		ConstructorOverloadding obj2 = new ConstructorOverloadding(50,10);
		ConstructorOverloadding obj3 = new ConstructorOverloadding(50,10,20);
		

	}

}
