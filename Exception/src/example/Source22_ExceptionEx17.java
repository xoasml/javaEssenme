package example;

public class Source22_ExceptionEx17 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main()에서 예외가 처리 되었습니다.");
		}
	}
	
	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1()에서 예외가 처리 되었습니다.");
			throw e;		// 다시 예외를 발생시킨다.
		}
	}
}
