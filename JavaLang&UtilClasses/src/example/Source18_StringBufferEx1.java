package example;

public class Source18_StringBufferEx1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		
		System.out.println("sb == sb2 : " + (sb == sb2));
		System.out.println("sb.equals(sb2) : " + sb.equals(sb2));
		
		String s = sb.toString();
		String s2 = sb2.toString();
		System.out.println("s.equals(s2) : " + s.equals(s2));
		
	}
}
