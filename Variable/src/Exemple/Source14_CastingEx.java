package Exemple;

public class Source14_CastingEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f%n", f);
		System.out.printf("f = %20.18f%n", d);
		System.out.printf("f = %20.18f%n", d2);
	}
}
