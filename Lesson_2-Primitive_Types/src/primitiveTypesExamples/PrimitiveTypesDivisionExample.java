package primitiveTypesExamples;

public class PrimitiveTypesDivisionExample {

	public static void main(String[] args) {

		double a = 2;
		int b = 5;
		int c = 7000000;
		double d = 2.5;
		//The biggest type determines the type of the arithmetic expression.
		//In this case, the type of e will be double.
		double e = b/a;
		
		System.out.println("double: " + a);
		System.out.println("int: " + b);
		System.out.println("int: " + c);
		System.out.println("double: " + d);
		System.out.println("(int)" + b + "/(double)" + a + ": " + e + " - result is double!");

	}

}
