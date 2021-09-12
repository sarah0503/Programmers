
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int people = stages.length;
        TreeMap<Double, Integer> fail = new TreeMap <Double, Integer>();
    	double ch_count = people;
        for(int i =0; i<N;i++) {
        	double count = 0;
        	double fail_count = 0;
        	for(int j = 0; j<people; j++) {
        		if (stages[j] == (i+1))
        			fail_count ++;
        	}
        	count = fail_count / ch_count;
           // System.out.println(fail_count + " " + ch_count);
        	fail.put(count, i+1); 
        }
        
       Iterator <Double> it = fail.keySet().iterator();
       int i = 0;
       while(it.hasNext()) {
    	   Double key = it.next();
    	   System.out.println(fail.get(key));
       }
        return answer;
    }
}