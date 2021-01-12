package example;

@FunctionalInterface
interface MyFunction2 {
	void myFunction();	// public abstract void myFunction();
}

public class Source02_LambdaEx2 {
	public static void main(String[] args) {
		MyFunction2 f = ()->{};	// MyFunction2 f = (MyFunction2) () ->{};
		Object obj = (MyFunction2)()->{};	// Obejct 타입으로 형변환이 생략됨.
		String str = ((Object)(MyFunction2)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		System.out.println();
		
//		System.out.println(()->{});	// 에러. 람다식은 Object로 형변환이 안됨.
		System.out.println((MyFunction2) ()->{});	// Object 타입으로 형변환이 생략 됐음.
		System.out.println(((MyFunction2) (()->{})).toString());
	}
}
