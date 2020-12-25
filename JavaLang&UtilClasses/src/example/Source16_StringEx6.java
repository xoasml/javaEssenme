package example;

public class Source16_StringEx6 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
		
		System.out.println(String.join("", strVal, "+" , strVal2, "=")+sum);
		System.out.println(strVal+"+"+ strVal2 + "=" + sum);
		
	}
}
