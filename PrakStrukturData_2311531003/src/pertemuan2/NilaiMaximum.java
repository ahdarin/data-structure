package pertemuan2;
import java.util.Stack;
public class NilaiMaximum {

	public static int max(Stack<Integer> s) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue = s.pop();
		backup.push(maxValue);
		while(!s.empty()) {
			int next = s.pop();
			backup.push(next);
			maxValue = Math.max(maxValue, next);
		}
		while (!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		Stack<Integer> s =new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("Nilai Maksimum " + max(s) + 
							"\nStack Teratas " + s.peek() +
							"\nIsi Stack" + s);
	}

}
