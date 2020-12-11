package example;

public class Source27_BlockTest {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public Source27_BlockTest() {
			System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		Source27_BlockTest bt = new Source27_BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		Source27_BlockTest bt2 = new Source27_BlockTest();
		
		
	}
}
