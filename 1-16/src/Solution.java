import java.util.ArrayList;

public class Solution {
	public int solution (int numbers[]) {
		int answer = 45;
		for(int i = 0; i<numbers.length; i++) {
			answer -= numbers[i];
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int numbers[] = {5,8,4,0,6,7,9};
		s.solution(numbers);
	}
}
