package Exemple;

import java.util.Scanner;

public class Source25_OperatorEx25 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		System.out.println("문자 하나를 입력하세요 : ");
		
		ch = new String(scan.nextLine()).charAt(0);
		
		if(ch >= '0' && ch <= '9') {
			System.out.println("ch : "+ch+" 는 숫자입니다.");
		}
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("ch : "+ch+" 는 스펠링입니다.");
		}
	}
}
