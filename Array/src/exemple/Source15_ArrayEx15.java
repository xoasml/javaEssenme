package exemple;

public class Source15_ArrayEx15 {
	public static void main(String[] args) {
		String source ="SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						 ,"..-.", "--.", "....", "..", ".---"
						 ,"-.-", ".-..", "--", "-.", "---"
						 ,".--.", "--.-", ".-.", "...", "-"
						 ,"..-", "...-", ".--", "-..-", "-.--"
						 ,"--.."};
		
		String result = "";
		
		for(int i=0; i<source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println(source);
		System.out.println(result);
	}
}
