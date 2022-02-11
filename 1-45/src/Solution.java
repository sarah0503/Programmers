import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList <Integer> array = new ArrayList<Integer>();
        int count = 0;
        long temp = n;
        while(n >0){
        	n /= 10;
        	count++;
        }
        
        for(int i = 0; i<count ; i++) {
        	array.add( (int) (temp % 10));
        	temp /= 10;
        }
        
        Collections.sort(array);
        count = 1;
        for(int i = 0; i<array.size();i++) {
        	answer += (long) array.get(i)*(count);
        	count*=10;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		long answer = s.solution(118372);
		System.out.println(answer);
	}
}
