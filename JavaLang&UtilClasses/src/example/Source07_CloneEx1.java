package example;

import java.util.Arrays;

public class Source07_CloneEx1 {
	public static void main(String[] args) {
		CloneTest ct1 = new CloneTest(10);
		CloneTest ct2 = ct1.clone();
		System.out.println(ct1);
		System.out.println(ct2);
	}
}

class CloneTest implements Cloneable{
	private int x;

	public CloneTest(int x) {
		this.x = x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public String toString() {
		return "x : " + x;
	}
}
