package example;

public class Source09_CalendarEx9 {
	public static void main(String[] args) {
		System.out.println("2014. 5. 31 :" + getDayOfWeek(2014, 5, 31));
		System.out.println("2012. 6. 1 :" + getDayOfWeek(2012, 6, 1));
		System.out.println("2014. 5. 1 - 2014.4.28 :" + dayDiff(2014, 5, 1, 2014, 4, 28));
		System.out.println("2015. 6. 29 : " + convertDateToDay(2015, 6, 29));
		System.out.println("735778 : " + convertDayToDate(735778));
	}
	
	public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31};
	
	public static boolean isLeapYear(int year) {
		return ((year%4==0)&&(year%100!=0) || (year%400==0));
	}
	
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
		// (1~7) 1은 일요일
		return convertDateToDay(year, month, day)%7 + 1;
	}
	
	public static String convertDayToDate(int day) {
		int leapYear = 0;
		
		int year = 1;
		int month = 0;
		
		while(true) {
			int aYear = isLeapYear(year) ? 366 : 365;
			if(day > aYear) {
				day -= aYear;
				year++;
			} else {
				break;
			}
		}
		
		while(true) {
			int endDay = endOfMonth[month];
			// 윤년이고 윤달이 포함되어 있으면 1을 더한다.
			if(isLeapYear(year) && month == 1) {
				endDay++;
			}
			
			if(day > endDay) {
				day -= endDay;
				month++;
			} else {
				break;
			}
		}
		
		
		return year+"-"+ (month+1) +"-"+day;
	}
	
	public static int convertDateToDay(int year, int month, int day) {
		int leapYear = 0;
		
		// 1년~설정된 년까지 윤년이 몇번 있는지 체크
		for(int i = 1 ; i < year ; i++) {
			if(isLeapYear(i)) {
				leapYear++;
			}
		}
		int dateToDay = ((year-1) * 365) + leapYear;
		
		// 마지막년도의 일 수 계산
		for(int i = 0 ; i < month-1 ; i++) {
			dateToDay += endOfMonth[i];
		}
		
		// 윤년이고 2월이 포함되어 있으면 1 증가
		if(month > 2 && isLeapYear(year)) {
			dateToDay++;
		}
		
		return dateToDay+day;
	}
}
