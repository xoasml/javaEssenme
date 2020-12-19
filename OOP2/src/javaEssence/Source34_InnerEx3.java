package javaEssence;

public class Source34_InnerEx3 {
	private int outerIv = 0;
	static int  outerCv = 0;

	class InstanceInner {
		int ilv = outerIv;		// 외부 클래스의 private멤버도 접근가능.
		int ilv2 = outerCv;
	}
	
	static class StaticInner {
//  스태틱클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int iv = 0;	// jdk1.8부터 final 생략 가능 final을 안붙이고 지역클래스에서 사용 하면 
		final int LV = 0; //                               컴파일러가 알아서 final을 붙여줌.
		
		class LocalInner {
			int liv  = outerIv;
			int liv2 = outerCv;
			int liv3 = iv;
			int liv4 = LV;
		}
	}
}
