package example;

public class Source08_CalendarEx8 {
	public static void main(String[] args) {
		String date1 = "201508";
		String date2 = "201406";
		
		// 년과 월을 subString으로 잘라서 정수로 변환한다.
		// 년에 12를 곱해서 월로 변환한 다음 뺄셈을 하면 개월차를 구할 수 있다.
		int month1 = Integer.parseInt(date1.substring(0, 4))*12 + Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0, 4))*12 + Integer.parseInt(date2.substring(4));
		
		int difference = Math.abs(month1 - month2);
		
		System.out.println(date1 + "과 " + date2 + "는 "+difference + "개월 차이 입니다.");
	}
}
