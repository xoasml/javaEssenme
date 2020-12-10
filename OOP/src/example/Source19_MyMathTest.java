package example;


class MyMath2{
	long a, b;
	
	//인스턴스 변수 a,b만을 사용해야 함으로 매개변수가 필요없음
	long add()		{ return a+b; }
	long subtract() { return a-b; }
	long multiply() { return a*b; }
	double divide()	{ return (double)a/b; }
	
	// 인스턴스 변수와 상관없이 매개변수만으로 작업이 가능하다.
	static long   add(long a, long b)	   { return a+b; }
	static long   subtract(long a, long b) { return a-b; }
	static long   multiply(long a, long b) { return a*b; }
	static double divide(double a, double b)   { return a/b; }
}



public class Source19_MyMathTest {
	public static void main(String[] args) {
		//인스턴스 메서드는 객체 생성 후에만 호출이 가능
		MyMath2 mm = new MyMath2();
		mm.a = 10L;
		mm.b = 3L;
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		// 클래스 메서드는 객체 생성없이 호출가능
		System.out.println(MyMath2.add(10L, 3L));
		System.out.println(MyMath2.subtract(10L, 3L));
		System.out.println(MyMath2.multiply(10L, 3L));
		System.out.println(MyMath2.divide(10f, 3f));
	}
}
