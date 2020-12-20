package example;

import java.io.File;
import java.util.*;

public class Source16_ExceptionEx16 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			File f = createFile(scan.nextLine());
			System.out.println(f.getName() + "파일이 생성되었습니다.");
		}catch (Exception e) {
			System.out.println(e.getMessage() + "다시 입력하여 주시기 바랍니다.");
		}
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName==null || fileName.equals("")) {
			throw new Exception("파일이름이 유효하지 않습니다.");
		}
		File f = new File(fileName);		// File클래스의 객체를 만든다.
		// File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		f.createNewFile();
		return f;	// 생성된 객체의 참조를 반환한다.
	}
}
