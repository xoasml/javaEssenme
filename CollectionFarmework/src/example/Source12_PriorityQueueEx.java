package example;

import java.util.PriorityQueue;
import java.util.Queue;

public class Source12_PriorityQueueEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);
		
		Object obj = null;
		
		// PriorityQueue에 저장된 노드를 하나씩 꺼낸다.
		while((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
	}
}
