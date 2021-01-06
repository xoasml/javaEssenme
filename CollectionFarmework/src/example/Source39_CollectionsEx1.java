package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Source39_CollectionsEx1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		
		
		Collections.rotate(list, 2);	//오른쪽으로 두 칸씩 이동
		System.out.println(list); // [4, 5, 1, 2, 3]
		
		
		Collections.swap(list, 0, 2);	//첫 번째와 세 번재를 교환(swap)
		System.out.println(list); // [1, 5, 4, 2, 3]
		
		
		Collections.shuffle(list);	// 저장된 요소의 위치를 임의로 변경
		System.out.println(list);	// 무작위
		
		
		Collections.sort(list);	// 정렬
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		
		Collections.sort(list,Collections.reverseOrder()); // 역순 정렬
		System.out.println(list); // [5, 4, 3, 2, 1]
		
		
		int idx = Collections.binarySearch(list, 3); // 3이 저장된 위치(index)를 반환
		System.out.println(idx); // 2
		
		
		System.out.println("max = " + Collections.max(list));	// max = 5
		System.out.println("min = " + Collections.min(list));	// min = 1
		System.out.println("min = " + Collections.max(list, Collections.reverseOrder()));	// min = 1
		
		
		Collections.fill(list, 9); // list를 9로 채운다
		System.out.println(list); // [9, 9, 9, 9, 9]
		
		
		//list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = Collections.nCopies(list.size(), 2);
		System.out.println(newList); // [2, 2, 2, 2, 2]
		
		
		System.out.println(Collections.disjoint(list, newList)); // 공통요소가 없으면 true
		
		
		Collections.copy(list, newList);
		System.out.println(newList);	// [2, 2, 2, 2, 2]
		System.out.println(list);		// [2, 2, 2, 2, 2]
		
		
		Collections.replaceAll(list, 2, 1); // 모든 객체를 찾아 2와 같으면 1로 변경한다
		System.out.println(list);  // [1, 1, 1, 1, 1]
		
		
		Enumeration e = Collections.enumeration(list);	// 리스트를 Enumeration로 변환한다
		
		
		ArrayList list2 = Collections.list(e);	// Enumeration를 리스트로 변환한다.
		
		
		System.out.println(list2); // [1, 1, 1, 1, 1]
		
	}
	
}
