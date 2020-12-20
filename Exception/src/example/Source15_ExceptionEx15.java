package example;

import java.io.File;
import java.util.*;

public class Source15_ExceptionEx15 {
	public static void main(String[] args) {
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		Scanner scan = new Scanner(System.in);
		File f = createFile(scan.nextLine());
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	}
	
	@SuppressWarnings("finally")
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일이름이 유효하지 않습니다.");
			}
		} catch(Exception e) {
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName); // File클래스의 객체를 만든다.
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		}catch(Exception e) {}
	}
}
