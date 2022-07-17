import java.util.Stack;

public class Solution {

	public int solution(String s) {
		int answer = 0;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		if (stack.size() == 0)
			return 1;

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution("baabaa");
		System.out.println("answer = " + answer);
	}
}
