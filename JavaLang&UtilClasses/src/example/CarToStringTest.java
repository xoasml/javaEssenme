package example;

class Car {
	String kind;
    String color;
    int door;
    
    public Car(String kind, String color, int door) {
		this.kind = kind;
		this.color = color;
		this.door = door;
	}
    
    @Override
    public String toString(){
    	return "kind : " + this.kind + ", color : " + this.color + ", door : " + this.door;
    }
}

class CarToStringTest {
	public static void main(String[] args) {
    	Car c1 = new Car("SUV", "RED", 4);
        Car c2 = new Car("SportCar", "BLACK", 2);
        System.out.println(c1);
        System.out.println(c2.toString());
    }
}
