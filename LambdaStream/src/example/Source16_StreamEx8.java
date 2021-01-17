package example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import example.Students.Level;


public class Source16_StreamEx8 {
	public static void main(String[] args) {
		System.out.println("1. 단순그룹화(반별로 그룹화");
		Map<Integer, List<Students>> stuBan = 
				Students.getStuStream()
				.collect(Collectors.groupingBy(Students::getBan));
		
		for (Integer ban : stuBan.keySet()) {
			List<Students> tmp = stuBan.get(ban);
			System.out.println(ban + "반");
			for (Students stu : tmp) {
				System.out.println(stu);
			}
		}
		System.out.println("\n");
		
		
		System.out.println("2. 단순그룹화(성적별로 그룹화)");
		Map<Students.Level, List<Students>> stuScore = 
				Students.getStuStream()
				.collect(Collectors.groupingBy(s -> {
					if (s.getScore() >= 200) {
						return Students.Level.HIGH;
					} else if (s.getScore() >= 100) {
						return Students.Level.MID;
					} else {
						return Students.Level.LOW;
					}
				}));
		TreeSet<Students.Level> keySet = new TreeSet<Students.Level>(stuScore.keySet());
		
		for(Students.Level lv : keySet) {
			System.out.println("["+lv+"]");
			for(Students stu : stuScore.get(lv)) {
				System.out.println(stu);
			}
		}
		System.out.println("\n");
		
		
		System.out.println("3. 단순그룹화 + 통계(성적별 학생수)");
		Map<Students.Level, Long> stuNumScore = 
				Students.getStuStream()
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) {
						return Level.HIGH;
					} else if(s.getScore() >= 100) {
						return Level.MID;
					} else {
						return Level.LOW;
					}
				}, Collectors.counting()));
		
		TreeSet<Students.Level> key = new TreeSet<Students.Level>(stuNumScore.keySet());
		for(Level lv : key) {
			System.out.println("["+lv+"] - " + stuNumScore.get(lv));
		}
		System.out.println("\n");
		
		
		System.out.println("4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Students>>> stuHakBan = Students.getStuStream()
				.collect(Collectors.groupingBy(Students::getHak, Collectors.groupingBy(Students::getBan)));
		
		for(int hak : stuHakBan.keySet()) {
			for(int ban : stuHakBan.get(hak).keySet()) {
				for( Students stu : stuHakBan.get(hak).get(ban)) {
					System.out.println(stu);
				}
				System.out.println();
			}
		}
		System.out.println("\n");
		
		
		System.out.println("5. 다중그룹화 + 통계(학년별, 반별 1등)");
		Map<Integer, Map<Integer, Students>> stuHakBanTop = Students.getStuStream()
				.collect(Collectors.groupingBy(Students::getHak
						,Collectors.groupingBy(Students::getBan
						,Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparing(Students::getScore))
								, Optional::get
								)
							)
						));
		for(Map<Integer, Students> ban : stuHakBanTop.values()) {
			for(Students stu : ban.values())
			System.out.println(stu);
		}
		System.out.println("\n");
		
		
		System.out.println("6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
		Map<String, Set<Students.Level>> stuHakBanLevel = Students.getStuStream()
				.collect(Collectors.groupingBy(s -> s.getHak() + "-" + s.getBan(),
						Collectors.mapping(s-> {
							if(s.getScore() >= 200) {
								return Students.Level.HIGH;
							} else if(s.getScore() >= 100) {
								return Students.Level.MID;
							} else {
								return Students.Level.LOW;
							}
						}, Collectors.toSet())
				));
		
		for(String key1 : stuHakBanLevel.keySet()) {
			System.out.println(key1 + " " + stuHakBanLevel.get(key1));
		}
		
		
	}
}
