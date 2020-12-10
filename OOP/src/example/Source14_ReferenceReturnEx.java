package example;

public class Source14_ReferenceReturnEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		d.y = 5;
		Data d2 = copy(d);
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d2.x);
		System.out.println(d2.y);
		
		copy2(d, d2);
		System.out.println(d2.x);
		System.out.println(d2.y);
		
		change(d2);
		System.out.println(d2.x);
		System.out.println(d2.y);
		
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
	
	static void copy2(Data d, Data d2) {
		 d2 = d;
	}
	
	static void change(Data d2) {
		d2.y = 5;
	}
}
