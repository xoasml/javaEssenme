package example;

import java.util.Arrays;

class MyArrayList<T> {
	T[] arr;
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	MyArrayList(T... arr) {
		this.arr = arr;
	}
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <T>  MyArrayList<T> asList(T... a) {
		return new MyArrayList<T>(a);
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
	
}

public class Source12_AnnotationEx4 {
	public static void main(String[] args) {
		MyArrayList<String> list = MyArrayList.asList("1", "2", "3");
		
		System.out.println(list);
	}
}
