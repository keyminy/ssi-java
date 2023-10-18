package d3;

import java.util.Stack;

public class HanoiTest {

	public static void main(String[] args) {
		Stack<Integer> from = new Stack<>();
		Stack<Integer> via = new Stack<>(); //경유지(=중간 막대기 하나더) 
		Stack<Integer> to = new Stack<>(); //최종 목적지
		
		from.push(5);
		from.push(4);
		from.push(3);
		from.push(2);
		from.push(1);
		
		//stack안에 무슨 값이 있는지
 		printResult(from,via,to);
		
		//4번째 인자 : 얼마나 쌓였는지??
		hanoi(from,via,to,from.size());
		
		//stack안에 무슨 값이 있는지
		printResult(from,via,to);
	}
	
	public static void printResult(Stack<Integer> from,Stack<Integer> via,Stack<Integer> to) {
		System.out.println(from);
		System.out.println(via);
		System.out.println(to);
		System.out.println("------------------");
	}
	
	public static void hanoi(Stack<Integer> from
			,Stack<Integer> via,Stack<Integer> to,int num) {
		//탈출 조건!!
		if(num == 0) {
			return;
		}
		hanoi(from,to,via,num-1);
		move(from,to,num-1);
		hanoi(via,from,to,num-1);
	}
	
	public static void move(Stack<Integer> from, Stack<Integer> to, int num) {
		//이동이 잘 되었는지 확인
		//from과 to의 hash코드는 같아야하는데..
//		System.out.println(from.hashCode() + " -> " + to.hashCode() + " [" + num + "] ");
		//from -> to로 집어넣기
		to.push(from.pop());
		
	}

}
