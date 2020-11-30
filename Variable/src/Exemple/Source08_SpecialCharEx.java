package Exemple;

public class Source08_SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\'');				// '''는 사용할수 없음으로 \'를 사용해야 '가 출력됨
		System.out.println("abc\t123\b456");	// \t에 의해 탭이 입력되고 \b에 의해 3이 지워진다.
		System.out.println('\n');				// 개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");		// 큰따옴표를 출력할수 있다.
		System.out.println("c:\\");				//	\(역슬래쉬)를 출력할수 있다.
	}
}
