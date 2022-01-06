
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int people = stages.length;
        //TreeMap<Integer, Double> fail = new TreeMap <Integer, Double>();
        TreeMap<Double , Integer> fail = new TreeMap <Double , Integer>();
    	double ch_count = people;
        for(int i =0; i<N;i++) {
        	double count = 0;
        	double fail_count = 0;
        	for(int j = 0; j<people; j++) {
        		if (stages[j] == (i+1))
        			fail_count ++;
        	}
        	//System.out.println(fail_count);
        	count = (ch_count - fail_count) / ch_count;
        	//System.out.println(ch_count);
        	//System.out.println(count);
            //System.out.println(fail_count + " " + ch_count);
        	ch_count -= fail_count;
        	//fail.put(i+1, count); 
        	fail.put(count, i+1);
        }
        
       //Iterator <Integer> it = fail.descendingKeySet().iterator();
       Iterator <Double> it = fail.descendingKeySet().iterator();
       int i = 0;
       while(it.hasNext()) {
    	   Double key = it.next();
    	   System.out.println(fail.get(key));
    	   System.out.println(key);
       }
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	int [] array = {2,1,2,6,2,4,3,3};
		s.solution(6, array);
	}
}