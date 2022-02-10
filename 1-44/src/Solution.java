
import java.util.*;

public class Solution {
    public int[] solution(long n) {
        ArrayList <Integer> tempAnswer= new ArrayList <Integer>();
        for (int i =1; i<=n; i *=10) {
        	int temp = (int)(( n/ i ) %10);
        	tempAnswer.add(temp);
        }
        
        int answer[] = tempAnswer.stream().mapToInt(i->i).toArray();

        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		s.solution((long) 900000000);
		
	}
}