
public class Solution {
	public static int answer = 0;
	public int solution(int[] numbers, int target) {
		dfs(0,0,numbers,target);
		return answer;
	}
	
	public static void dfs (int depth, int sum, int [] numbers, int target) {
		if(depth == numbers.length) {
			if(sum == target) 
				answer ++;
			return ;
		}
		
		for(int i = 0; i<= 1; i++) {
			if(i == 0) {
				sum += numbers[depth];
			}
			else {
				sum-= numbers[depth];
			}
			
			dfs(depth+1, sum, numbers, target);
			
			if(i == 0) {
				sum -= numbers[depth];
			}
			else {
				sum += numbers[depth];
			}
		}
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] numbers = {4,2,1,2};
		int target = 4;
		
		System.out.println(s.solution(numbers, target));
	}

}
