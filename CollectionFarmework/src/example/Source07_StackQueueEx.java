package example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Source07_StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현체 LinkedList사용

		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		while(!st.empty()){
			System.out.println(st.pop());
		}

		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}
}
