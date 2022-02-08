
public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if ( a == b) {
        	return a;
        }
        if(a > b) {
        	int temp = b;
        	b = a;
        	a = temp;
        }
        for(int i = a; i<=b; i++) {
        	answer += i;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		int a = 3; 
		int b = 5;
		Solution s = new Solution();
		System.out.println(s.solution(a, b));
	}
}
