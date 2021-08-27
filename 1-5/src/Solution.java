import java.util.Stack;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		//@SuppressWarnings("unchecked")
		Stack<Integer>[] a = new Stack[5];
		for (int i = 0; i < 5; i++) {
			a[i] = new Stack<Integer>();
		}
		Stack<Integer> b = new Stack<>();
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				a[j].push(board[i][j]);
			}
		}
		
		int length = moves.length;
		for (int i = 0; i < length; i++) {
			int num = moves[i] - 1;
			int now = 0;
			while (true) {
				if (a[num].isEmpty() == true)
					break;
				else {
					now = a[num].pop();
					if (now != 0)
						break;
				}
			}

			if (now != 0) {
				if (!(b.isEmpty())) {
					if (now == b.peek()) {
						b.pop();
						answer +=2;
					}
					else {
						b.push(now);
					}
				}
				else {
				b.push(now);
				}

			}
		}
		return answer;
	}

}