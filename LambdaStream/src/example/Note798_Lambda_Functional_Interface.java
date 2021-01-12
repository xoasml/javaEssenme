package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//함수형 인터페이스

public class Note798_Lambda_Functional_Interface {
	public static void main(String[] args) {
		// 798p ======================================================
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		
		Collections.sort(list, new Comparator<String>(){
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		
		Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
	}
}
