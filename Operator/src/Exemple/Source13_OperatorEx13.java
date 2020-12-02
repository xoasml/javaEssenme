package Exemple;

public class Source13_OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1 + 1;			// 컴파일 에러 발생.
		char c2 = 'a' + 1;			// 컴파일 에러 없음.
		
		System.out.println(c2);
	}
}
