package Exemple;
/*
 * 스펠링의 유니코드 값은 소문자보다 대분자가 32 작다 이를 이용해 대소문자 변경이 가능하다
 */
public class Source15_OperatorEx15 {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);	//int형과 char의 연산 결과는 항상 int이므로 (char)형변환을 잊지말자
		
		System.out.println(upperCase);
	}
}
