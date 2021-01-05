package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Source34_TreeMapEx1 {
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A","K", "K", "K", "Z", "D"};
		
		TreeMap<Object, Object> map = new TreeMap<Object, Object>();
		
		for(int i = 0; i< data.length;i++) {
			if(map.containsKey(data[i])) {
				map.put(data[i], (Integer)map.get(data[i])+1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		System.out.println("기본 정렬");
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + " : " + print((Integer)e.getValue(), '#') );
		}
		System.out.println();
		
		TreeMap map2 = new TreeMap(Comparator.reverseOrder());
		map2.putAll(map);
		it = map2.entrySet().iterator();
		
		System.out.println("역순 정렬");
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey() + " " + print((Integer)e.getValue(), '#'));
		}
		System.out.println();
		
		Set set = map.entrySet();
		ArrayList list = new ArrayList(set);
		System.out.println("크기별 정렬");
		
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
		
		while (it.hasNext()) {
			Map.Entry e= (Map.Entry)it.next();
			System.out.println(e.getKey() + " : " + print((Integer)e.getValue(), '#'));
		}
		
	}
	
	static class ValueComparator implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = ((Integer)e1.getValue());
				int v2 = ((Integer)e2.getValue());
				
				return v2 - v1;
			}
			return -1;
		}
	}
	
	static String print(int size, char ch) {
		String result = "";
		for(int i = 0 ; i < size ; i++ ) {
			result += ch;
		}
		return result+ " " + size;
	}
}


