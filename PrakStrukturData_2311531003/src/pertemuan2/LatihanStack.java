package pertemuan2;

import java.util.Stack;

public class LatihanStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(42);
		s.push(-3);
		s.push(17);
		System.out.println("nilai stack= " + s);
		System.out.println("nilai pop= " + s.pop());
		System.out.println("nilai stack setelah pop= " + s);
		System.out.println("nilai pop= " + s.pop());
		System.out.println("nilai stack setelah 2 pop= " + s);
	}

}
