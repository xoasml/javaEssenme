package Exemple;

public class Source03_OperatorEx3 {
	public static void main(String[] args) {
		int i = 5, j = 5;
		
		System.out.println(++i);
		System.out.println(j++);
		
		System.out.println(String.format("i=%s , j=%s", i, j));
		
		int x = 5;
		x = x++ - ++x; // 이게 머선일이고..
		System.out.println(x);
		
		
	}
}
