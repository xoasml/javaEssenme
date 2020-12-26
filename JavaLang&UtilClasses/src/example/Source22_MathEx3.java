package example;

public class Source22_MathEx3 {
	public static void main(String[] args) {
		int x1 = 1, y1 = 1;	//(1, 1)
		int x2 = 2, y2 = 2;	//(2, 2)
		
		double c = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		double a = c * Math.sin(Math.PI/4);	// PI/4 rad = 45 degree
		double b = c * Math.cos(Math.PI/4);
		double z = c * Math.cos(Math.toRadians(4));
		
		System.out.printf("a = %f%n",a);
		System.out.printf("b = %f%n",b);
		System.out.printf("c = %f%n",c);
		System.out.printf("angle=%f rad%n", Math.atan2(a,b));
		System.out.printf("angle=%f degree%n", Math.atan2(a,b) * 180 / Math.PI);
		System.out.printf("24 * log10(2)=%f%n", 24 * Math.log10(2));
		System.out.printf("53 * log10(2)=%f%n", 53 * Math.log10(2));
		
	}
}
