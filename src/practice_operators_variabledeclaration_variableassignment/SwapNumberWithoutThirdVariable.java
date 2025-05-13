package practice_operators_variabledeclaration_variableassignment;

public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("-- before swapping without temp variable --");
		System.out.println("Value of a before swap :" + a);
		System.out.println("value of b before swap :" + b);
		
		a=a-b;//a becomes = -10
		b=a+b;//b becomes = 10
		a=b-a;//a becomes =20
		
		System.out.println("-- after swapping without temp variable --");
		System.out.println("Value of a after swap :" + a);
		System.out.println("Value of b after swap :" + b);
		
      /*  float first = 12.0f, second = 24.5f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        // swapping number with temp variable
        int A = 10, B=20;
        System.out.println("-- befor swapp with temp variable");
        System.out.println("value of A before swap :" + A);
        System.out.println("Value of B before swap :" + B);
        
        int Temp = A;
        A=B;//10=20
        B=Temp;//10
        System.out.println("After Swapp with temp variable");
        System.out.println("Value of A after swap :"+ A);
        System.out.println("Value of B after swap :" + Temp);*/

	}

}
