import java.util.Stack;

public class Solution {
	public String solution(String p) {
		String answer = "";
		int end = divide(p);
		System.out.println(end);
		// int start = end + 1;

		String u = p.substring(0, end);
		String v = p.substring(end);

		if (u == null)
			return answer;

		System.out.println("u : " + u);
		System.out.println("v : " + v);

		if (check(u) == true) {
			answer += u;
			if (v != "") {
				end += divide(v);
				answer += solution(v);
			}
		} else {
			answer += "(";
			if (v != "")
				answer += solution(v);
			answer += ")";
			u = u.substring(1, u.length() - 1);
			for (int i = 0; i < u.length(); i++) {
				if (u.charAt(i) == ')')
					answer += "(";
				else
					answer += ")";
			}
		}
		return answer;

	}

	public boolean check(String u) {
		if (u.length() == divide(u) && u.startsWith("("))
			return true;
		else
			return false;

	}

	public int divide(String p) {
		int count = 0;
		Stack<Character> stack = new Stack<Character>();
		if (p.startsWith("(")) {
			for (int i = 0; i < p.length(); i++) {

				if (i >= 1 && stack.isEmpty()) {
					count = i;
					return count;
				}
				if (p.charAt(i) == ('(')) {
					stack.add(p.charAt(i));
				} else {
					stack.pop();
				}
			}
		} else {
			for (int i = 0; i < p.length(); i++) {

				if (i >= 1 && stack.isEmpty()) {
					count = i;
					return count;
				}
				if (p.charAt(i) == (')')) {
					stack.add(p.charAt(i));
				} else {
					stack.pop();
				}
			}
		}
		return p.length();
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String p = "(()())()";
		String answer = s.solution(p);
		System.out.println("정답 : " + answer);
	}
}
