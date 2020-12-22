package example;

public class Practice01_TryWithResources {
	public static void main(String[] args) {
		try(ExamClass ec = new ExamClass()){
			ec.method();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ExamClass implements AutoCloseable{
	
	public void method() throws Exception {
		System.out.println("ExamClass... method ... ing");
		throw new Exception();
	} 
	
	public void close() throws Exception {
		System.out.println("Exam close()..");
	}
}