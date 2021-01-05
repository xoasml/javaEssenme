package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Source32_HashMapEx3 {
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		
		addPhoneNo("친구", "최성욱", "010987654");
		addPhoneNo("친구", "고동우", "010111111");
		addPhoneNo("친구", "명재윤", "010222222");
		addPhoneNo("짜장", "02222222");
		addPhoneNo("국밥", "02111111");
		
		printList();
	}
	
	// 그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	// 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		
		Iterator  it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet();
			
			Iterator subIt = subSet.iterator();
			
			System.out.println("* " +e.getKey() + "[" + subSet.size() + "]");
			while (subIt.hasNext()) {
				Map.Entry e2 = (Map.Entry)subIt.next();
				System.out.println(e2.getValue() + " " + e2.getKey());
			}
		}
	}
}
