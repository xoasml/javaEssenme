package example;
/*
 * 인스턴스 맴버 > 인스턴스 변수/메서드 , static 변수/메서드 모두 호출가능
 * 클래스(static) 맴버 > static변수/메서드 호출가능, 인스턴스 변수/메서드 호출하려면 객체생성 해야함.
 * 
 */
public class Source20_MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; // 에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new Source20_MemberCall().iv;	// 이처럼 객체를 생성해야 사용가능.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // 에러. 클래스메서드에서 인스턴스 변수 사용불가.
		Source20_MemberCall c = new Source20_MemberCall();
		System.out.println(c.iv);	// 객체를 생성해야 인스턴스 변수 사용 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);	// 인스턴스 변수에서는 인스턴스변수를 바로 사용가능.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();	// 에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
		Source20_MemberCall c = new Source20_MemberCall();
		c.instanceMethod1();	// 인스턴스를 생성한 후에야 호출할 수 있음.
	}
	
	void instanceMethod2() {	//인스턴스메서드에서는 인스턴스메서드와 클래스메서드
		staticMethod1();		// 모두 인스턴스 생성없이 바로 호출 가능.
		instanceMethod1();
	}
	
}
