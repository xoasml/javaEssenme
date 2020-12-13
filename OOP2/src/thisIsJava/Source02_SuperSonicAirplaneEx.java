package thisIsJava;

public class Source02_SuperSonicAirplaneEx {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = sa.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = sa.NORMAL;
		sa.fly();
		
		sa.land();
		
	}
}

class Airplane{
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}

class SuperSonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
			
	}
	
}
