package exemple;
/*테스트는 cmd에서 가능하다.*/
public class Source16_ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("매개 변수의 개수 : " + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+ args[i]+"\"");
		}
	}
}
