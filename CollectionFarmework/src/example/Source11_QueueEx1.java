package example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Source11_QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	//Queue에 최대 5개까지만 저장되로록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">> ");
			try {
				// 화면에서 라인단위로 입력 받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다. ");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE +"개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					// 입력받은 명령어를 저장하고
					save(input);
					
					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}
	
	public static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input)) {
			q.offer(input);
		}
		if(q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}
