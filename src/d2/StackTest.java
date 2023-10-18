package d2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		list.push("one");
		list.push("two");
		list.push("three");
		System.out.println(list.pop());
		
		Queue<Integer> queueList = new LinkedList<>();
		queueList.offer(3);
		queueList.offer(7);
		queueList.offer(2);
		System.out.println(queueList);
	}

}
