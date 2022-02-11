
public class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num != 1) {
        	if(num %2 == 0) {
        		num /=2;
        	}
        	else {
        		num = (num*3) + 1;
        	}
        	answer ++;
        	if(answer > 450) {
        		return -1;
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution(6);
		System.out.println(answer);
	}
}
