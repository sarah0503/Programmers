
import java.util.*;

public class Solution {
    public int[] solution(long n) {
    	int count = 0;
    	long number = n;
    	while(n > 0) {
    		n = n/10;
    		count ++;
    	}
        int [] answer = new int[count];
        
        for(int i = 0; i<count ; i++) {
        	answer[i] = (int) (number % 10);
        	number /= 10;
        }

        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(99999999);
		
	}
}