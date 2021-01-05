package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Source33_HashMapEx4 {
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A","K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap();
		
		for(int i=0 ; i < data.length ; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() +1));
			}else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			int value = (Integer)e.getValue();
			
			System.out.print(e.getKey() + " : " + print(value, '#') + value +"\n");
			
		}
	}
	
	static String print(int value, char ch) {
		String result = "";
		for(int i = 0 ; i < value ; i++) {
			result += ch;
		}
		
		return result;
	}
}
