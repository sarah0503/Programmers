
public class Solution {
	public int solution (int numbers[], int numbers_len) {
		int answer = 0;
		for(int i = 1; i<numbers_len+1; i++) {
			boolean check = false;
			int num = 0;
			for(int j = 0; j<numbers.length; j++) {
				if(numbers[j] == i) {
					check = true;
					num = j;
					break;
				}
			}
			
			if(check == false) {
				System.out.println(i);
				answer +=i;
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int len = 9;
		int numbers[] = {1,2,3,4,6,7,8,0};
		s.solution(numbers, len);
	}
}
