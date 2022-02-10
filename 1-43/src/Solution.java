
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i =1; i<=n; i *=10) {
        	int temp = ( n/ i ) %10;
        	answer += temp;
        	System.out.println(temp);
        }

        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(98765001));
		
	}
}