package example;

public class Source09_AnnotationEx1 {
}

class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	void parentMethod() {}
}