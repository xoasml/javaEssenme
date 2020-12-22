package example;

public class Source23_ChainedExceptionEx {
	public static void main(String[] args) {
		try {
			install();
			System.out.println("설치완료");
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException {
		try {
			startInstall();	//프로그램 설치에 필요한 준비를 한다.
			copyFiles();	// 파일을 복사한다.
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일을 삭제한다.
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {		// 충분한 설치 공간이 없다면..
			throw new SpaceException("설치 공간이 부족합니다.");
		}
		if(!enoughMemory()) {		// 충분한 메모리가 없으면..
			throw new MemoryException("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	}
	
	static void copyFiles()		  {System.out.println("설치 임시파일 복사 ");}
	static void deleteTempFiles() {System.out.println("설치 임시파일 제거");}
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
}

// 커스텀Exception(InstallException)
class InstallException extends Exception {
	public InstallException(String msg) {
		super(msg);
	}
}

// 커스텀Exception(SpaceException) 
class SpaceException extends Exception {
	public SpaceException(String msg) {
		super(msg);
	}
}

// 커스텀Exception(MemoryException)
class MemoryException extends Exception {
	public MemoryException(String msg) {
		super(msg);
	}
}