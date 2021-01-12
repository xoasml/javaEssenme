package example;

@FunctionalInterface
interface MyFunction{
	void run();		//public abstract void run();
}

public class Source01_LambdaEx1 {
	
	static void excute(MyFunction f) {	// 매개변수 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction getMyFunction() {	// 반환 타입이 MyFunction인 메서드
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {	// 익명클래스로 run()을 구현
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		excute(f1);
		excute(() -> System.out.println("run()"));
	}
}
