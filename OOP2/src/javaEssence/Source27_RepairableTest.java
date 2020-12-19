package javaEssence;

public class Source27_RepairableTest {
	public static void main(String[] args) {
		
		SCV27 scv = new SCV27();
		Tank27 tank = new Tank27();
		Dropship27 dropship = new Dropship27();
		Marine27 marine = new Marine27();
		
		scv.repair(scv);
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);
	}
}

interface Repairable {
}

class Unit27 {
	int hitPoint;
	final int MAX_HP;

	Unit27(int hp) {
		this.MAX_HP = hp;
	}
}

class GroundUnit27 extends Unit27 {
	GroundUnit27(int hp) {
		super(hp);
	}
}

class AirUnit27 extends Unit27 {
	public AirUnit27(int hp) {
		super(hp);
	}
}

class Tank27 extends GroundUnit27 implements Repairable {
	Tank27() {
		super(150); // Tank의 hp는 150이다.
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship27 extends AirUnit27 implements Repairable {
	public Dropship27() {
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine27 extends GroundUnit27 {
	public Marine27() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV27 extends GroundUnit27 implements Repairable {
	public SCV27() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit27) {
			Unit27 u = (Unit27)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u+"의 수리가 끝났습니다.");
		}
	}
}