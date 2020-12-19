package javaEssence;

public class Source29_InterfaceTest2 {
	public static void main(String[] args) {
		A29 a = new A29();
		a.autoPlay(new B29());
		a.autoPlay(new C29());
	}
}

class A29 {
	void autoPlay(I29 i) {
		i.play();
	}
}

interface I29 {
	public abstract void play();
}

class B29 implements I29 {
	@Override
	public void play() {
		System.out.println("play in B29 class");
	}
}

class C29 implements I29 {
	@Override
	public void play() {
		System.out.println("play in C29 class");
	}
}