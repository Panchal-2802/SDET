package polymorphism;
import encapsulation.Encapsulation;// packageName.ClassName

public class EncapsulationWithDifferentPackage {

	public static void main(String[] args) {
		Encapsulation obj1 = new Encapsulation();
		obj1.setAccountNum(9276952112l);
		long AccountNum = obj1.getAccountNum();
		System.out.println(AccountNum);

	}

}
