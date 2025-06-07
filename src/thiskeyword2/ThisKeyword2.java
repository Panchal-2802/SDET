package thiskeyword2;

public class ThisKeyword2 {
int x,y;
ThisKeyword2(int x , int y){
	this.x=x;
	this.y=y;
}

void disply() {
	System.out.println(x);
	System.out.println(y);
}
	public static void main(String[] args) {
		ThisKeyword2 obj1 = new ThisKeyword2(100,200);
		obj1.disply();
		

	}

}
