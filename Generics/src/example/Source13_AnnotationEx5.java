package example;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class Source13_AnnotationEx5 {
	public static void main(String[] args) {
		// AnnotationEx5의 Class객체를 얻는다.
		Class<Source13_AnnotationEx5> cls = Source13_AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) {
			System.out.println("testTools="+str);
		}
		
		System.out.println();
		
		// AnnotationEx5에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
	int		count()			default 1;
	String	testedBy();
	String[] testTools()	default "JUnit";
	TestType testType()		default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
	String yymmdd();
	String hhmmss();
}

enum TestType {FIRST, FIFAL}