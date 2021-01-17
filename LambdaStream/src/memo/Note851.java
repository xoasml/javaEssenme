package memo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import example.Students;

public class Note851 {
	public static void main(String[] args) {
		
		Map<Boolean, List<Students>> stuSex = Students.getStuStream().collect(Collectors.partitioningBy(Students::isMale));
		
		List<Students> maleStudent = stuSex.get(true);
		List<Students> femaleStudent = stuSex.get(false);
		
		System.out.println(maleStudent);
		System.out.println(femaleStudent);
		
	}
}
