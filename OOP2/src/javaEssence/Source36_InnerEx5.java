package javaEssence;

class Outer36{
	int value = 10; // Outer.this.value
	
	class Inner {
		int value = 20 ; // this.value
		
		void method1() {
			int value = 30;
			System.out.println("           value" + value);
			System.out.println("      this.value" + this.value);
			System.out.println("Outer.this.value" + Outer36.this.value);
		}
	} // Inner클래스의 끝
} //Outer클래스의 끝

public class Source36_InnerEx5 {
	public static void main(String[] args) {
		Outer36 oc = new Outer36();
		Outer36.Inner ii = oc.new Inner();
		
		ii.method1();
	}
}
