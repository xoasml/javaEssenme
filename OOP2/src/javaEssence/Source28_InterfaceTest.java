package javaEssence;

public class Source28_InterfaceTest {
	public static void main(String[] args) {
		A28 a = new A28();
		a.method1(new B28());
	}
}

class A28 {
	public void method1(B28 b) {
		b.method2();
	}
}

class B28 {
	public void method2() {
		System.out.println("method2()");
	}
}