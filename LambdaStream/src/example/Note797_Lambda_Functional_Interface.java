package example;

//함수형 인터페이스
@FunctionalInterface
interface CompInt {
	public abstract int max(int a, int b);
}

public class Note797_Lambda_Functional_Interface {
	public static void main(String[] args) {
		// 람다를 사용 하지 않고 함수인터페이스 구현
//		CompInt f = new CompInt() {
//		
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
//		System.out.println(f.max(1, 2));
		
		// 람다를 사용 하여 함수 인터페이스 구현
		CompInt mf = (a, b) -> a > b ? a : b;
		
		System.out.println(mf.max(5, 2));
	}
}

