package Exemple;

public class Source28_OperatorEx28 {
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t\t%s%n", y, toBinaryString(x));
		
		System.out.printf("%#X | %#X = %#X \t\t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t\t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t\t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
		
	}
	
	static String toBinaryString(int i) {	//10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(i);
		
		return tmp.substring(tmp.length()-32);
	}
}
