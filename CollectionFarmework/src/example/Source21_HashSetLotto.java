package example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Source21_HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6 ; i++) {
			set.add( (int)(Math.random()*45)+1 );
		}
		
		List list = new LinkedList(set);
		list.sort(Comparator.naturalOrder());
		
		System.out.println(list);
	}
}
