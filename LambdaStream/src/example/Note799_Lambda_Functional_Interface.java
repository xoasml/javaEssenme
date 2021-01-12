package example;

@FunctionalInterface
interface MyMethod {
	abstract void myMethod();
}

public class Note799_Lambda_Functional_Interface {
	public static void main(String[] args) {
		MyMethod f = () -> System.out.println("myMethod() one ing...");
		aMethod(f);
		
		aMethod(() -> System.out.println("myMethod() two ing..."));
	}
	
	static void aMethod(MyMethod f) {
		f.myMethod();
	}
}
