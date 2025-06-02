package oopsConcept;

public class DifferentWaysToDeclareVariable {
int sid;
String name;
int standard;

void PrintData() {
	System.out.println("Student id : " + sid + " " + "Student name : " + name + " " + " Standard : "+ standard);
	System.out.println();
	System.out.println("Student id : " + sid );
	System.out.println("Student name : " + name);
	System.out.println("Standard : "+ standard);
}

void setData(int id, String fullName, int age) {
	sid=id; name=fullName; standard=age;
}

// using constructor
public DifferentWaysToDeclareVariable(int roll, String FullName, int std){
	sid=roll; name=FullName; standard=std;
}
	

	public static void main(String[] args) {
		// by using object reference
		/*DifferentWaysToDeclareVariable class1 = new DifferentWaysToDeclareVariable();
		class1.name="hardik";
		class1.standard=8;
		class1.sid=2802;
		class1.PrintData();
		
		
		// by using method
		DifferentWaysToDeclareVariable class2 = new DifferentWaysToDeclareVariable();
		class2.setData(8, "panchal", 25);
		class2.PrintData();*/
		
		// using constructor
		DifferentWaysToDeclareVariable class3 = new DifferentWaysToDeclareVariable(10, "RockyHandsome", 25);
		class3.PrintData();

	}

}
