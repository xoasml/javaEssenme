package example;

class Person {
	long id;
	
	public Person(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return this.id == ((Person)obj).id;
		} else {
			return false;
		}
	}
}

public class Source02_EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(987654321L);
		Person p2 = new Person(987654321L);
		
		if(p1 == p2) {
			System.out.println("1. p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("1. p1과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("2. p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("2. p1과 p2는 다른 사람입니다.");
		}
	}
}
