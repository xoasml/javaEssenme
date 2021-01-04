package example;

import java.util.Arrays;
import java.util.Comparator;


public class Source19_ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); // String의 COmparable구현에 의한 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함;
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}
