package memo;

import java.util.OptionalInt;

public class Note838 {
	public static void main(String[] args) {
		OptionalInt opt1 = OptionalInt.of(0);  // OptionalInt에 0을 저장 
		OptionalInt opt2 = OptionalInt.empty();  // OptionalInt에 0을 저장
		
		System.out.println(opt1.isPresent());
		System.out.println(opt2.isPresent());
		
		System.out.println(opt1.getAsInt());
//		System.out.println(opt2.getAsInt()); //NoSuchElementException 발생
		System.out.println(opt2.orElse(1234)); // null이면 매개변수 값으로 대체
		System.out.println(opt1.equals(opt2));
	}
}
