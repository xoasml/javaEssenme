package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Source04_LambdaEx4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < 10 ; i++) {
			list.add(i);
		}
		
		for(int i : list)System.out.print(i+",");
		System.out.println();
		
		// list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x -> x%2==0 || x%3==0);
		System.out.println(list);
		
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든 요소를 {k,v}의 형식으로 출력한다.
		map.forEach((k, v) -> System.out.println("key : " + k + " / " + "value : " + v ));
		
		map.compute("1", (k, v) -> v+"@");
		map.replaceAll((k, v) -> v+"!");
		System.out.println(map);
	}
}
