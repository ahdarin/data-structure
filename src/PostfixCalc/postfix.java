package PostfixCalc;
import java.util.*;
public class postfix {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		while(input.hasNext()) {
			if (input.hasNextInt()) {
				s.push(input.nextInt());
			} else {
				String operator = input.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals("+"))
					s.push(operand1 + operand2);
				else if (operator.equals("-"))
					s.push(operand1 - operand2);
				else if (operator.equals("*"))
					s.push(operand1 * operand2);
				else if (operator.equals("/"))
					s.push(operand1 / operand2);
			}
		}
		return s.pop();
	}

}
