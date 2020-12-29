package example;

import java.util.Calendar;

public class Source07_CalendarEx7 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage : java CalendarEx7 2020 12");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		// 월의 경우 0 부터 11까지의 값을 가지므로 1을 빼줘야 한다.
		// 예를 들어, 2004년 11월 1일은 sDay.set(2004, 10, 1)과 같이 해줘야 한다.
		sDay.set(year, month-1, 1);
		
		// 입력월의 말일로 날짜를 설정한다.
		eDay.set(year, month-1, eDay.getMaximum(Calendar.DATE));
		
		// 전달의 날짜와 연결되게 하기
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		// 다음달의 날짜와 연결되게 하기
		eDay.add(Calendar.DATE,7-eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("      "+year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1), n++) {
			int day = sDay.get(Calendar.DATE);
			System.out.print((day >= 10 ? " " : "  ") + day);
			if(n%7==0) {
				System.out.println();
			}
		}
	}
}
