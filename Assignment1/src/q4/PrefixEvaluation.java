package q4;

import java.util.Stack;

public class PrefixEvaluation {
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

	public static int prefixEvaluation(String expr) {

		String arr[] = expr.trim().split(" ");

		Stack<Integer> st = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {

			String ele = arr[i];

			try {
				int a = Integer.parseInt(ele);

				st.push(a);
			} catch (Exception e) {
				int op1 = st.pop();
				int op2 = st.pop();

				int res = calculate(op1, ele, op2);

				st.push(res);

			}
		}

		return st.pop();
	}

	public static void main(String[] args) {
		String prefix = "+ 9 * 12 6";

		System.out.println("Prefix : " + prefix);
		int result = prefixEvaluation(prefix);
		System.out.println("Result : " + result);

	}

}
