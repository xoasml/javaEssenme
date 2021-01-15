package memo;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int score;
	
	Student(String name, int ban, int score){
		this.name = name;
		this.ban = ban;
		this.score = score;
	}
	
	public static Student[] getStuArr() {
		Student[] stuArr = {
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
		};
		return stuArr;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, score).toString();
	}
	
	String getName() {
		return name;
	}
	
	int getBan() {
		return ban;
	}
	
	int getTotalScore() {
		return score;
	}
	
	@Override
	public int compareTo(Student o) {
		return o.score - this.score;
	}
}
