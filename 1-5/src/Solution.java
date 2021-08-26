import java.util.Stack;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		@SuppressWarnings("unchecked")
		Stack<Integer>[] a = new Stack[5];
		for (int i = 0; i < 5; i++) {
			a[i] = new Stack<Integer>();
		}
		Stack<Integer> b = new Stack<>();
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				a[j].push(board[i][j]);
				// System.out.println(board[i][j]);
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
						System.out.println(now);
					}
				}
				else {
				b.push(now);
				System.out.println(now);
				}

			}
			// while(true) {
//			if (i >= 1) {
//				System.out.println("last");
//				System.out.println(b[i]);
//				System.out.println();
//				if (b.lastElement() == b.indexOf(i - 1)) {
//					// b.pop(); b.pop();
//					System.out.println("pop!");
//					System.out.println(b.pop());
//					System.out.println(b.pop());
//					System.out.println();
//				}
//			}
			// }

		}
		System.out.println();
		System.out.println(b.size());
		System.out.println("==========");
		
		for(int i = 0; i<b.size();i++) {
			System.out.println(b.pop());
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] boardd = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] movesd = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(s.solution(boardd, movesd));
		//s.solution(boardd, movesd);
	}
}
