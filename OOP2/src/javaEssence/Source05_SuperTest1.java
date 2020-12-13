package javaEssence;

import java.net.URL;

public class Source05_SuperTest1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
	
	
}

class Parent{
	int x = 10;
}

class Child extends Parent{
	
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x + ", super.x = " + super.x);
	}
}