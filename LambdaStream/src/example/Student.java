package example;

public class Student implements Comparable<Student>{
	
	String name;
	int ban;
	int score;
	
	public Student(String name, int ban, int score) {
		this.name = name;
		this.ban = ban;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", this.name, this.ban, this.score);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBan() {
		return this.ban;
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public int compareTo(Student o) {
		return o.score - this.score;
	}
	
}
