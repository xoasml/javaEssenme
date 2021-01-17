package example;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Source14_StreamEx6 {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
		};
		
		// 학생 이름만 뽑이서 List에 저장
		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
		Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);
		
		for(Student s : stuArr2) {
			System.out.println(s);
		}
		
		// 스트림을 Map<String, Student>로 변환. 학생 이름이 key
		Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(Student::getName, x -> x));
		
		for(String name : stuMap.keySet()) {
			System.out.println(name + " - " + stuMap.get(name));
		}
		
		long count = Stream.of(stuArr).collect(Collectors.counting());
		long totalScore = Stream.of(stuArr).collect(Collectors.summingLong(Student::getScore));
		
		System.out.println("count : " + count);
		System.out.println("totalScore : " + totalScore);
		
		totalScore = Stream.of(stuArr).collect(Collectors.reducing(0, Student::getScore, Integer::sum));
		System.out.println("totalScore : " + totalScore);
		
		Optional<Student> topStudent = Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore)));
		System.out.println("topStudent : " + topStudent.get());
		
		IntSummaryStatistics stat = Stream.of(stuArr).collect(Collectors.summarizingInt(Student::getScore));
		System.out.println(stat);
		
		String stuNames = Stream.of(stuArr).map(Student::getName).collect(Collectors.joining(",","[","]"));
		System.out.println(stuNames);
		
		
		
	}
}


