package example;

public class Source21_NewExceptionTest{
	public static void main(String[] args) {
		try(ForInstall fi = new ForInstall()){
			fi.startInstall();
			fi.copyFiles();
		}catch(SpaceException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("설치 공간을 확보한 후에 다시 설치하시기 바랍니다.");
		}catch(MemoryException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.gc();	// Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요.");
		}
	}
	
	
	
}

class ForInstall implements AutoCloseable {
	static public void startInstall() throws SpaceException, MemoryException {
		System.out.println("startInstall ing..");
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	@Override
	public void close() throws SpaceException, MemoryException {
		System.out.println(" close() ing..");
		deleteTempFiles();
	}

	static boolean enoughSpace() { // 설치하는데 필요한 공간이 있는지 확인한다.
		return false;
	}

	static boolean enoughMemory() {// 설치하는데 필요한 메모리공간이 있는지 확인한다.
		return true;
	}

	static void copyFiles() {
		System.out.println("설치 임시파일 복사");
	}

	static void deleteTempFiles() {
		System.out.println("설치 임시파일 삭제");
	}
}

class SpaceException extends Exception {
	public SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	public MemoryException(String msg) {
		super(msg);
	}
}


