
public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i<=n; i++) {
        	int count = 0;
        	for(int j = 2; j < i ; j++) {
        		if(i % j == 0 ) count ++;;
        	}
        	if (count <1) {
        		answer ++;
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution(5);
		System.out.println(answer);
	}
}
