import java.util.Arrays;

public class Solution {
    public int solution(int n) {
    	int answer = 0;
    	int[] pri = new int[n];
    	Arrays.fill(pri, 0);
    	pri[0] = 1;
    	
    	for(int i = 2; i<Math.sqrt(n); i++) {
    		if(pri[i-1] == 0) {
    			for(int j = i*2; j<=n; j += i) {
    				pri[j-1] = 1;
    			}
    		}
    	}
    	
    	for(int i = 0; i<n; i++) {
    		if(pri[i] == 0) answer++;
    	}
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution(5);
		System.out.println(answer);
	}
}
