package example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Source15_StreamEx7 {
	public static void main(String[] args) {
		System.out.println("1. 단순분할(성별로 분할)");
		Map<Boolean, List<Students>> stuBySex = Students.getStuStream().collect(Collectors.partitioningBy(Students::isMale));
		List<Students> male = stuBySex.get(true);
		List<Students> female = stuBySex.get(false);
		
		System.out.println(male);
		System.out.println(female);
		
		System.out.println("2. 성별당 학생 수");
		Map<Boolean, Long> stuNumBySex = Students.getStuStream().collect(Collectors.partitioningBy(Students::isMale, Collectors.counting()));
		System.out.println("남학생 수 : " + stuNumBySex.get(true));
		System.out.println("여학생 수 : " + stuNumBySex.get(false));
		
		System.out.println("3. 성별 1등");
		Map<Boolean, Optional<Students>> stuScoreBySex = Students.getStuStream().collect(Collectors.partitioningBy(Students::isMale, Collectors.maxBy(Comparator.comparingInt(Students::getScore))));
		
		System.out.println("남학생 1등 : " + stuScoreBySex.get(true));
		System.out.println("여학생 1등 : " + stuScoreBySex.get(false));
		
		Map<Boolean, Students> stuScoreBySex2 = Students.getStuStream().collect(Collectors.partitioningBy(Students::isMale,
																			    Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Students::getScore)), Optional::get)));
		
		System.out.println(stuScoreBySex2.get(true));
		System.out.println(stuScoreBySex2.get(false));
		
		
		Map<Boolean, Map<Boolean, List<Students>>> failedStuBySex = Students.getStuStream().collect(Collectors.partitioningBy(Students::isMale
																								  , Collectors.partitioningBy(s -> s.getScore() <= 100)));
		
		System.out.println(failedStuBySex.get(true).get(true));
		System.out.println(failedStuBySex.get(false).get(true));
	}
}


