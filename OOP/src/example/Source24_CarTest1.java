package example;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
}

public class Source24_CarTest1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 컬러 : " + c1.color + "c1의 기어타입 : " + c1.gearType + "c1의 문 갯수 : " + c1.door);
		System.out.println("c2의 컬러 : " + c2.color + "c2의 기어타입 : " + c2.gearType + "c2의 문 갯수 : " + c2.door);
		
	}
}
