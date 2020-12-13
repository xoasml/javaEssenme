package thisIsJava;

class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
}

public class Source01_ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator c = new Calculator();
		System.out.println(c.areaCircle(r));
		
		Computer c2 = new Computer();
		System.out.println(c2.areaCircle(r));
	}
}