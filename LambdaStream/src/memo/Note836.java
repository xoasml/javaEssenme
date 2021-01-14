package memo;

import java.util.Optional;

public class Note836 {
	public static void main(String[] args) {
		String str = "abc";
		Optional<String> optVal1 = Optional.of(str);
		Optional<String> optVal2 = Optional.of("def");
		Optional<String> optVal3 = Optional.of(new String("ghi"));
		
//		Optional<String> optVal4 = Optional.of(null);		// 에러남
		Optional<String> optVal5 = Optional.ofNullable(null); // 널이 들어갈 확률이 있으면 ofNullable을 사용해야한다.
		
		
		Optional<String> optVal6 = null; // 널로 초기화가 가능하지만 이후 과정에서 예외가 발생함
		Optional<String> optVal7 = Optional.empty(); // 하지만 empty()로 초기화 하는게 더 올바름.
		
		String str1 = optVal1.get();
		String str2 = optVal7.orElse("널이 들었어요");
		
		System.out.println(String.format("str1 : %s, str2 : %s", str1, str2));
		
		
		String str3 = optVal7.orElseGet(String::new);
		String str4 = optVal7.orElseThrow(NullPointerException::new);
		
	}
}
