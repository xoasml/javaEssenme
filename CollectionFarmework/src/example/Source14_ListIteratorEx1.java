package example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Source14_ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		ListIterator lt = al.listIterator();
		
		while(lt.hasNext()) {
			System.out.print(lt.next());
		}
		System.out.println();
		while(lt.hasPrevious()) {
			System.out.print(lt.previous());
		}
	}
}
