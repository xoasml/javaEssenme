package example;

import java.util.List;
import java.util.Vector;

public class Source03_VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5); // 용량(Capacity)이 5인 Vector를 생산한다.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); // 빈공간 없애기
		System.out.println("=== After trimToSize ===");
		print(v);
		
		v.ensureCapacity(6); // 최소 공간을 6으로 설정
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}
	
	static void print(Vector v) {
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
