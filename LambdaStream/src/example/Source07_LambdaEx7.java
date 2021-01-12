package example;

import java.util.function.Function;
import java.util.function.Predicate;

public class Source07_LambdaEx7 {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i*i;
		Function<Integer, Integer> g = i -> i+2;
		
		Function<Integer, Integer> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h2.apply(5));
		
		Function<String, String> f2 = Function.identity();
		System.out.println(f2.apply("A"));
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate();
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		
		String str1 = "ABC";
		String str2 = "ABC";
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
		
	}
}
