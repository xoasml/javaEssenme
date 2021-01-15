package memo;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Note846_02 {
	public static void main(String[] args) {
		int[] oriArr = new Random().ints(1, 46).distinct().limit(6).toArray();
		
		IntStream intStream = IntStream.of(oriArr);
		OptionalInt max1 = intStream.max();
		System.out.println(max1);
		
		intStream = IntStream.of(oriArr);
		Optional<Integer> max2 = intStream.boxed().reduce(Integer::max);
		System.out.println(max2);
		
		intStream = IntStream.of(oriArr);
		Optional<Integer> max3 = intStream.boxed().collect(Collectors.reducing(Integer::max));
		System.out.println(max3);
		
		intStream = IntStream.of(oriArr);
		long sum1 = intStream.reduce(0, (a,b) -> a+b);
		System.out.println(sum1);
		
		intStream = IntStream.of(oriArr);
		long sum2 = intStream.boxed().collect(Collectors.reducing(0, (a,b) -> a+b));
		System.out.println(sum2);
		
		Stream<Student> stuStrm = Stream.of(Student.getStuArr());
		int grandTotal1 = stuStrm.map(Student::getTotalScore).reduce(0, Integer::sum);
		System.out.println(grandTotal1);
		
		stuStrm = Stream.of(Student.getStuArr());
		int grandTotal2 = stuStrm.collect(Collectors.reducing(0,Student::getTotalScore,Integer::sum));
		System.out.println(grandTotal2);
	}
}
