package Exemple;
/*
 * 변수란 ?
 * 단 하나의 값을 저장할 수 있는 메모리 공간. 
 */
public class Source01_VarEx {
	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
	}
}
