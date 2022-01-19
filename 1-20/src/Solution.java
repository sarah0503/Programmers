import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<numbers.length-1 ; i++) {
        	for(int j = i+1; j<numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        		//System.out.println(numbers[i]+numbers[j]);
        	}
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        int size = 0;
        for(Integer temp : list) {
        	answer[size++] = temp;
        }
        
        
        
        return answer;
    }
    
    public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		Solution s = new Solution();
		int [] result = s.solution(numbers);
	}
}
