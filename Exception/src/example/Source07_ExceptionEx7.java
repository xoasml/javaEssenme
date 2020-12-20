package example;

public class Source07_ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) {	// ArithmeticException을 제외한 모든 Exception이 처리된다.
			System.out.println("Exception");
		}
	}
}
