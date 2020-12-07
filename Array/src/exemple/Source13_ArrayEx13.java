package exemple;

public class Source13_ArrayEx13 {
	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E', '2', '4'};
		
		String[] binary =	{"0000", "0001", "0010", "0011"
							,"0100", "0101", "0110", "0111"
							,"1000", "1001", "1010", "1011"
							,"1100", "1101", "1110", "1111"};
		
		String result="";
		
		for(int i=0; i<hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <='9') {
				result +=binary[hex[i]-'0'];
				System.out.println("true binary[hex[i]-'0'] : " + binary[hex[i]-'0']);
			} else {
				result +=binary[hex[i]-'A'+10];
				System.out.println("false binary[hex[i]-'0'] : " + binary[hex[i]-'A'+10]);
			}
		}
		
		System.out.println(hex);
		System.out.println(result);
		
		
	}
}
