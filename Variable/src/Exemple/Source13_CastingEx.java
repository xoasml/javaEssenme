package Exemple;

public class Source13_CastingEx {
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("1. [int → byte] i=%d → b=%d%n", i, b);
		
		
		i = 300;
		b = (byte)i;
		System.out.printf("2. [int → byte] i=%d → b=%d%n", i, b);
		
		
		b = 10;
		i = (int)b;
		System.out.printf("3. [byte → int] i=%d → b=%d%n", i, b);
		
		
		b = -2;
		i = (int)b;
		System.out.printf("4. [byte → int] i=%d → b=%d%n", i, b);
		
	}
}
