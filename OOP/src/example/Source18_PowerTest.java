package example;

public class Source18_PowerTest {
	public static void main(String[] args) {
		int num = 2;
		int e = 5;
		
		int result = 0;
		for(int i = 1 ; i <= e ; i++) {
			result += power(num, i);
		}
		System.out.println(result);
	}
	
	static int power(int num, int i) {
		if(i == 1) return num;
		return num * power(num, i-1);
	}
}
