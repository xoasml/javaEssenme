package example;

public class Source07_CallStackTest1 {
	public static void main(String[] args) {
		firstMethod();
	}
	
	static void firstMethod() {
			secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
