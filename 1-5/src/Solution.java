import java.util.Stack;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> b = new Stack<Integer>();
		int now = 0;
		for (int i = 0; i < moves.length; i++) {
			
			now = -1;
			int num = moves[i] - 1;
			try {
			for (int j = 0; j < (board[j].length) ; j++) {
				
				if (board[j][num] != 0) {
					now = board[j][num];
					System.out.println("now : "+now);
					board[j][num] = 0;
					break;
				}
				
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				break;}
			
			
			
			if (now != -1) {
				if (!(b.isEmpty())) {
					if (now == b.peek()) {
						b.pop();
						answer += 2;
					} else {
						b.push(now);
					}
				} else {
					b.push(now);
				}

			}

		}return answer;

	}

}