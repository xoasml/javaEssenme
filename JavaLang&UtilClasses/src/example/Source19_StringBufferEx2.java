package example;

public class Source19_StringBufferEx2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("01");
		StringBuilder sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuilder sb3 = sb.append(78);
		sb.append(9.0);
		
		System.out.println("sb =" + sb);
		System.out.println("sb2 =" + sb2);
		System.out.println("sb3 =" + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		System.out.println("sb = " + sb.delete(3, 6));
		System.out.println("sb = " + sb.insert(3, "abc"));
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		
		System.out.println("Capacity = " + sb.capacity());
		System.out.println("length =" + sb.length());
	}
}
