package memo;

import java.util.Optional;

public class Note837 {
	public static void main(String[] args) {
		int reuslt = Optional.of("123").filter(x->x.length() > 0).map(Integer::parseInt).orElse(-1);
		System.out.println(reuslt);
	}
}
