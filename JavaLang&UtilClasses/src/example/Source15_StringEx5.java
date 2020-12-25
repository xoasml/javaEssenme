package example;

import java.util.Arrays;
import java.util.StringJoiner;

public class Source15_StringEx5 {
	public static void main(String[] args) throws Exception{
		String str = "가";
		
		byte[] bArr = str.getBytes("UTF-8");
		byte[] bArr2 = str.getBytes("CP949");
		
		System.out.println(bArr.length);
		
		System.out.println("UTF-8 : " + joinByteArr(bArr));
		System.out.println("CP949 : " + joinByteArr(bArr2));
		
		System.out.println("UTF-8 : " + new String(bArr, "UTF-8"));
		System.out.println("CP949 : " + new String(bArr2, "CP949"));
	}
	
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		for(byte temp : bArr) {
			sj.add(String.format("%02X", temp));
		}
		return sj.toString();
	}
	
	
}
