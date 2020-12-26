package example;

public class Source23_WrapperEx1 {
	public static void main(String[] args) {
		Boolean b = new Boolean("true");
		Boolean b2 = new Boolean(true);
		
		Character c = new Character('a');
		
		Byte bb = new Byte((byte) 10);
		Byte bb2 = new Byte("10");
		
		Short s = new Short((short) 10);
		Short s1 = new Short("10");
		
		Long l = new Long(100);
		
		Float f  = new Float(1.0);
		Float f2 = new Float(1.0f);
		Float f3 = new Float("1.0f");
		Float f4 = new Float("1.0");
		
		Integer i = new Integer(100);
		Integer i2 = new Integer("100");
		
		System.out.println("i == i2 ? " + (i == i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println("i.compareTo(i2) ? " + i.compareTo(i2));
		System.out.println("i.toString() = " + i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE);
		System.out.println("BYTES = " + Integer.BYTES);
		System.out.println("TYPE = " + Integer.TYPE);
		
	}
}
