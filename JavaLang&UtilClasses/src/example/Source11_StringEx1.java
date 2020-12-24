package example;

public class Source11_StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str 1 = \"abc\";");
		System.out.println("String str 2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();
		
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}
