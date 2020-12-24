package example;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Practice02_ClassTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		String str = "Class클래스 테스트";
		Class cObj = str.getClass();
		System.out.println("1. "+cObj.getSimpleName());	// 클래스의 이름만 호출한다.
		System.out.println("2. "+cObj.getPackageName());	// 패키지의 이름을 호출한다.
		System.out.println("3. "+cObj.getName());			// 패키지와 이름을 호출한다.
		System.out.println("4. "+cObj.toString());		// 클래스 패키지 이름을 호출한다.
		System.out.println("5. "+cObj.toGenericString());	// 제어자부터 패키지 이름 모두다 호출한다.
		
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Card c = new Card(); 		//String kind, int number, int width, int hight 를 가진 객체
		Class cObj2 = c.getClass(); //의 정보를 Class 클래스에 참조
		
		// Field 를 사용하려면 import java.lang.reflect.Field; 임포트를 해야한다.
		Field[] field = cObj2.getFields(); //getFields()는 public인 필드만 가지고 올수 있다.
		System.out.println(Arrays.toString(field));
		
		Field[] field2 = cObj2.getDeclaredFields(); // 제어자에 상관없이 모든 필드를 가지고 온다.
		System.out.println(Arrays.toString(field2));
	}
}
