
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int N, int[] stages) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int people = stages.length;
        //TreeMap<Integer, Double> fail = new TreeMap <Integer, Double>();
        ArrayList <Double> fail = new ArrayList <Double>();
    	double ch_count = people;
        for(int i =0; i<N+1;i++) {
        	double count = 0;
        	double fail_count = 0;
        	for(int j = 0; j<people; j++) {
        		if (stages[j] == (i+1))
        			fail_count ++;
        	}
        	//System.out.println(fail_count);
//        	if(ch_count < 0.0) {
//        		count = 0;
//        	}
//        	else {
        	count = (fail_count) / ch_count;
        	//System.out.println(ch_count);
        	//System.out.println(count);
            //System.out.println(fail_count + " " + ch_count);
        	ch_count -= fail_count;
//        	}
        	//fail.put(i+1, count); 
        	fail.add(count);
        }
        
       //Iterator <Integer> it = fail.descendingKeySet().iterator();
        
//       Iterator <Double> it = fail.descendingKeySet().iterator();
//       int i = 0;
//       while(it.hasNext()) {
//    	   Double key = it.next();
//    	   System.out.println(fail.get(key));
//    	   System.out.println(key);
//       }
        ArrayList temp = new ArrayList <Double>();
        for(int i = 0; i<fail.size(); i++) {
        	temp.add(fail.get(i));
        }
        temp.sort(Comparator.reverseOrder());
        for(int i = 0; i<fail.size(); i++) {
        }
        System.out.println();
        for(int i = 0; i<fail.size(); i++) {
        }
        boolean check = false ;
        for(int i = 0; i<fail.size(); i++) {
        	for(int j = 0; j<fail.size();j++) {
        		if (temp.get(i).equals(fail.get(j))) {
        			
        			for(int k = 0; k< answer.size();k++) {
        				if(answer.get(k) == j+1) {
        					check = true;
        				}
        			}
        			if(check == false) {
        				answer.add(j+1);
        				break;
        			}
        			else {
        				check = false;
        			}
        		}
        	}
        }
        
        for(int i = 0; i<answer.size()-1;i++) {
        	if (answer.get(i) == N+1) {
        		answer.remove(i);
        	}
        	//System.out.println(answer.get(i));
        }
        
        for (int i = 0; i<answer.size()-1 ; i++) {
        	System.out.println(answer.get(i));
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
//    	int [] array = {2,1,2,6,2,4,3,3};
//		s.solution(5, array);
    	int [] array = {1,2,2,1,3};
 		s.solution(8, array);
	}
}