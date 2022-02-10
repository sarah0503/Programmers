
public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n;i++) {
        	if(n%i ==0 ) {
        		answer += i;
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution(12);
		System.out.println(answer);
	}
}
