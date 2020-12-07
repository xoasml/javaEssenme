package exemple;
/*테스트는 cmd에서 가능하다.*/
public class Source17_ArrayEx17 {
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("input NUM1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		char op  = args[1].charAt(0);
		int num2 = Integer.parseInt(args[2]);
		
		switch (op) {
		case '+':
			System.out.println(String.format("%d + %d = %d", num1, num2, num1+num2));
			break;
		case '-': 
			System.out.println(String.format("%d - %d = %d", num1, num2, num1-num2));
			break;
		case 'x': 
			System.out.println(String.format("%d x %d = %d", num1, num2, num1*num2));
			break;
		case '/': 
			System.out.println(String.format("%d / %d = %f", num1, num2, (double)num1/num2));
		}
		
	}
}
