package example;

class Card {
	public String kind;
	public int number;
	
	int width;
	int hight;
	
	
	public Card() {
		this("SPADE", 1);
	}
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}


public class Source04_CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
