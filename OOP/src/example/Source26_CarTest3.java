package example;

class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3(Car3 c){	//인스턴스 복사를 위한 생성자
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
		
		this(c.color, c.gearType, c.door);	// 기존 생성자를 사용
	}
	
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(String color){
		this(color, "auto", 4);
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Source26_CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		System.out.println("c1의 컬러 : " + c1.color
				+ " / c1의 기어타입 : " + c1.gearType + " / c1의 문 갯수 : " + c1.door);
		System.out.println("c2의 컬러 : " + c2.color 
				+ " / c2의 기어타입 : " + c2.gearType + " / c2의 문 갯수 : " + c2.door);
		
		c1.door = 100;
		System.out.println("c1.door = 100 수행 후");
		System.out.println("c1의 컬러 : " + c1.color
				+ " / c1의 기어타입 : " + c1.gearType + " / c1의 문 갯수 : " + c1.door);
		System.out.println("c2의 컬러 : " + c2.color 
				+ " / c2의 기어타입 : " + c2.gearType + " / c2의 문 갯수 : " + c2.door);
	}
}
