package example;

class NewClass{
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {
		return oldField;
	}
}

public class Source10_AnnotationEx2 {
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		
		nc.oldField = 10;						// @Deprecated가 붙은 대상을 사용
		System.out.println(nc.getOldField());	// @Deprecated가 붙은 대상을 사용
	}
}
