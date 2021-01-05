package example;

import java.util.HashMap;
import java.util.Scanner;

public class Source30_HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력하세요");
			System.out.printf("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 일치하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
}
