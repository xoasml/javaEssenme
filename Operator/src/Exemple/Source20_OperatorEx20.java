package Exemple;

public class Source20_OperatorEx20 {
	public static void main(String[] args) {
		System.out.println(-10%8);
		System.out.println(10%8);
		System.out.println(-10%-8);
		
		System.out.println(10%8);	//  ↓결과는 같다↓
		System.out.println(10%-8);	//  ↑결과는 같다↑
	}
}
