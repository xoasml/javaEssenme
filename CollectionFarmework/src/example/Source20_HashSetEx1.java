package example;

import java.util.HashSet;
import java.util.Set;

public class Source20_HashSetEx1 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0 ; i<objArr.length ; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		
		Set hashSet1 = new HashSet();
		// set은 중복이 불가하기 때문에 중복된 노드들은 제거됐다.
		hashSet1.add(1); // Integer 타입의 숫자 1
		hashSet1.add("1"); // 문자열 1
		hashSet1.add("2"); // 문자열 2
		hashSet1.add("2"); // 문자열 2
		hashSet1.add("3"); // 문자열 3
		hashSet1.add("3"); // 문자열 3
		
		//숫자 1과 문자 1은 타입이 다르기 때문에 제거되지 않는다.
		System.out.println(hashSet1); //결과 : [1, 1, 2, 3]
		
		Set hashSet2 = new HashSet();
		
		hashSet2.add("1");
		hashSet2.add("2");
		hashSet2.add("4");
		
		//set은 중복이 불가하기 때문에 hashSet1의 노드중 
		//hashSet2의 노드와 동일한 값이 있다면 제거된다.
		hashSet2.addAll(hashSet1); // hashSet1의 모든 노드를 hashSet2에 저장한다.
		System.out.println(hashSet2); // 결과 : [[1, 1, 2, 3, 4]
	}
}
