package javaEssence;

public class Source30_InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}

class A{
	void methodA() {
		I b = InstanceManager.getInstance();
		b.methodB();
		System.out.println(b);
	}
}

interface I {
	public abstract void methodB();
}

class B implements I{
	@Override
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() {return "class B";}
}

class InstanceManager {
	public static I getInstance() {
		return new B();
	}
}
