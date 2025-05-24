package q4;

import java.util.Stack;

public class PostfixEvaluation {

	public static int calculate(int op1, String ele, int op2) {
		if (ele.equals("+"))
			return op1 + op2;
		else if (ele.equals("-"))
			return op1 - op2;
		else if (ele.equals("*"))
			return op1 * op2;
		else if (ele.equals("/"))
			return op1 / op2;
		else if (ele.equals("%"))
			return op1 % op2;
		else if (ele.equals("$"))
			return (int) Math.pow(op1, op2);
		else
			return 0;
	}

	public static int postfixEvaluation(String expr) {

		String arr[] = expr.trim().split(" ");

		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {

			String ele = arr[i];

			try {
				int a = Integer.parseInt(ele);
				
				st.push(a);
			} catch (Exception e) {
				int op2 = st.pop();
				int op1 = st.pop();

				int res = calculate(op1, ele, op2);

				st.push(res);

			}
		}

		return st.pop();
	}

	public static void main(String[] args) {
		String postfix = "4 5 6 * 3 / + 9 + 18 -";
		System.out.println("Postfix - " + postfix);
		int result = postfixEvaluation(postfix);
		System.out.println("Result - " + result);
	}

}
