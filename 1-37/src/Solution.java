
public class Solution {
    public int solution(int n) {
    	int answer = 0;
    	boolean[] pri = new boolean[n];
    	pri[0] = true;
    	
    	for(int i = 2; i<Math.sqrt(n); i++) {
    		if(pri[i-1] == false) {
    			for(int j = i+1; j<=n; j++) {
    				if(j%i == 0) {
    					pri[j-1] = true;
    					System.out.println(j);
    				}
    			}
    		}
    	}
    	
    	for(int i = 0; i<n; i++) {
    		if(pri[i] == false) answer++;
    	}
    	
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution(5);
		System.out.println(answer);
	}
}
