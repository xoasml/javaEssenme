package example;

import java.util.stream.Stream;

public class Students extends Student{
	
	boolean isMale;
	int hak;
	
	public Students(String name, boolean isMale, int hak, int ban, int score) {
		super(name, ban, score);
		
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	
	public boolean isMale() {
		return isMale;
	}
	
	public int getHak() {
		return hak;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s, %d학년, %d반 %d점]",name, isMale ? "남" : "여", hak, ban, score);
	}
	
	enum Level{HIGH, MID, LOW}
	
	public static Stream<Students> getStuStream(){
		Stream<Students> stusStrm = Stream.of(
					new Students("나자바", true,  1, 1, 300),
					new Students("김지미", false, 1, 1, 250),
					new Students("김자바", true,  1, 1, 200),
					new Students("이지미", false, 1, 2, 150),
					new Students("남자바", true,  1, 2, 100),
					new Students("안지미", false, 1, 2,  50),
					new Students("황지미", false, 1, 3, 100),
					new Students("강지미", false, 1, 3, 150),
					new Students("이자바", true,  1, 3, 200),
				
					new Students("나자바", true,  2, 1, 300),
					new Students("김지미", false, 2, 1, 250),
					new Students("김자바", true,  2, 1, 200),
					new Students("이지미", false, 2, 2, 150),
					new Students("남자바", true,  2, 2, 100),
					new Students("안지미", false, 2, 2,  50),
					new Students("황지미", false, 2, 3, 100),
					new Students("강지미", false, 2, 3, 150),
					new Students("이자바", true,  2, 3, 200)
				);
		return stusStrm;
	}
}
