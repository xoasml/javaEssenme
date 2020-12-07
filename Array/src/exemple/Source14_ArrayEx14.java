package exemple;

public class Source14_ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i = 0; i < src.length() ; i++) {
			char ch = src.charAt(i);	//src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+") : " + ch); 
		}
		
		//src를 char[]로 변환
		char[] cArr = src.toCharArray(); 
		
		//char[]을 출력
		System.out.println(cArr);
	}
}
