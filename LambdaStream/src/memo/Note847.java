package memo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Note847 {
	public static void main(String[] args) {
		Stream<Student> stuStrm = Stream.of(Student.getStuArr());
		
		String name = stuStrm.map(Student::getName).collect(Collectors.joining(","));
		System.out.println(name);
		
		
		stuStrm = Stream.of(Student.getStuArr());
		name = stuStrm.map(Student::getName).collect(Collectors.joining());
		System.out.println(name);
		
		stuStrm = Stream.of(Student.getStuArr());
		name = stuStrm.map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(name);
		
//		stuStrm = Stream.of(Student.getStuArr());
//		name = stuStrm.collect(Collectors.joining(","));
//		stuStrm.forEach(System.out::println);
		
	}
}
