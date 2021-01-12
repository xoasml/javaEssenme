package example;

@FunctionalInterface
interface MyFunction3{
	public abstract void myMethod();
}

class Outer{
	int val = 10; // Outer.this.val
	
	class Inner{
		int val=20; // this.val
		
		void method(int i) {	// void method(final int i) {
			int val = 30;	// Inner.this.val
//			i = 10; // 에러. 상수의 값을 변경할 수 없음
			
			MyFunction3 f = () -> {
				System.out.println("             i :" + i);
				System.out.println("           val :" + val);
				System.out.println("      this.val :" + ++this.val);
				System.out.println("Outer.this.val :" + ++Outer.this.val);
				
			};
			
			f.myMethod();
		}
	}
	
}

public class Source03_LambdaEx3 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		in.method(100);
	}
}
