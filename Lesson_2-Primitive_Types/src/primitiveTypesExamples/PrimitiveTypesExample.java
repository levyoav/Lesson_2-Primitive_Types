package primitiveTypesExamples;

public class PrimitiveTypesExample {

	public static void main(String[] args) {

		// numbers can be integers or decimals

		// integers
		byte n1 = 10;
		short n2 = 11;
		int n3 = 12;
		long n4 = 2147483648L; // L suffix (for literals larger than int)

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

		// decimals
		float n5 = 3.2F; // suffix F
		double n6 = 4.5;
		double n7 = 4D; //suffix D

		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);

		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = n1 < n2;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		// characters
		char c1 = 'A';
		char c2 = '�'; //Hebrew character

		System.out.println(c1);
		System.out.println(c2);
		
		int x = 0xf; // hexadecimal
		System.out.println(x);

	}

}
