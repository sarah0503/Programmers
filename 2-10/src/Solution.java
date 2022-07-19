import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public String[] solution(String[] orders, int[] course) {
        ArrayList <String >answerList = new ArrayList<String>();
        
        for(int i = 0; i<course.length; i++) {
        	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        
        	  
        	for(int j = 0; j<orders.length; j++) {
        		String str = orders[j];
        		
        		for(int k = 0; k<str.length()-course[i]+1; k++) {
        			String nowStr = str.substring(k, k+course[i]);
        			System.out.println(nowStr);
        			if(hashmap.containsKey(nowStr)) {
        				hashmap.put(nowStr, hashmap.get(nowStr) +1 );
        			}
        			else {
        				hashmap.put(nowStr, 0 );
        			}
        		}
        	}
        	
        	Integer max = Collections.max(hashmap.values());
        	
        	for(HashMap.Entry<String, Integer> entry : hashmap.entrySet()) {
        		String key = entry.getKey();
        		if(hashmap.get(key) == max && hashmap.get(key) > 1) {
        			answerList.add(key);
        			System.out.println(key);
        		}
        	}
        	
        	
        }
        
        
        String[] answer = answerList.toArray(new String[answerList.size()]);
        
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course = {2,3,5};
		String [] solution = s.solution(orders, course);
		for(int i = 0; i<solution.length; i++) {
			System.out.println("정답 : " + solution[i]);
		}
	}
}
