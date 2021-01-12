package example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class NoteFrom812To813_MethodReference {
	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> Integer.parseInt(s); // 람다식
		Function<String, Integer> f2 = Integer::parseInt; // 메소드 참조
		
		BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2); // 람다식
		BiFunction<String, String, Boolean> f4 = String::equals; // 메소드 참조
		
		// 생성자
		Supplier<List<String>> s1 = () -> new ArrayList<String>(); // 람다식
		Supplier<List<String>> s2 = ArrayList::new;	// 메소드 참조
		
		Function<Integer, int[]> f5 = i -> new int[i];	// 람다식
		Function<Integer, int[]> f6 = int[]::new;	// 메소드 참조
	}
}
