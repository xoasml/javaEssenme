package example;

import java.util.Iterator;

public class Source17_MyVector2Test {
	public static void main(String[] args) {
		Source16_MyVector2 v = new Source16_MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제 전 : " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println("삭제 후 : " + v);
	}
}
