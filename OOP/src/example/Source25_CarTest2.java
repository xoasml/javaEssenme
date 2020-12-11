package example;

class Car2{
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}

public class Source25_CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 컬러 : " + c1.color
							+ " / c1의 기어타입 : " + c1.gearType + " / c1의 문 갯수 : " + c1.door);
		
		System.out.println("c2의 컬러 : " + c2.color 
							+ " / c2의 기어타입 : " + c2.gearType + " / c2의 문 갯수 : " + c2.door);
	}
}
