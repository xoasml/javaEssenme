package example;

import java.io.IOException;

public class Practice02_ExceptionReThrowing {
	public static void main(String[] args) {
		try {
			method();
			
		} catch (Exception e) {
			e.getCause();
		}
	}
	
	static void method() throws Exception1{
		try {
			throw new ChildException2();
		} catch (Exception1 e) {
			e.printStackTrace();
			ChildException2 ce2 = new ChildException2();
			ce2.initCause(e);
			throw ce2;
		}
	}
	
}

class Exception1 extends Exception {
	public Exception1() {
		super();
	}
}

class ChildException1 extends Exception1 {
	public ChildException1() {
		super();
	}
}

class ChildException2 extends Exception1 {
	public ChildException2() {
		super();
	}
}