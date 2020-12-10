package example;

class Source06_MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 5L);
		long result2 = mm.subtract(5L, 5L);
		long result3 = mm.multiply(5L, 5L);
		double result4 = mm.divide(5L, 5L); // double 대신 long으로 호출, 이 값은 double도 자동형변환
		
		System.out.println("5L + 5L = " + result1);
		System.out.println("5L - 5L = " + result2);
		System.out.println("5L * 5L = " + result3);
		System.out.println("5L / 5L = " + result4);
	}
}

class MyMath{
	long add(long a, long b) {return a+b;}
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
}
