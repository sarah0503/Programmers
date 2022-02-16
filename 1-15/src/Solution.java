
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        double [] fail_percentage = new double [N];
        for(int i = 1; i<=N; i++) {
            double fail = 0;
            double come = 0;
        	for(int j = 0; j<stages.length; j++) {
        		
        		if(i <= stages[j]) {
        			come ++;
        		}
        		 if( i == stages[j]) {
        			fail ++;
        		}
        	}
        	fail_percentage[i-1] = fail/come;
        	System.out.println(fail_percentage[i-1]);
        	answer[i-1] = i;
        }
        
        for(int i = 0; i<answer.length; i++) {
        	for(int j = i+1; j<answer.length; j++) {
        		if(fail_percentage[i] < fail_percentage[j]) {
        			double temp = fail_percentage[i];
        			fail_percentage[i] = fail_percentage[j];
        			fail_percentage[j] = temp;
        			
        			int answer_temp = answer[i];
        			answer[i] = answer[j];
        			answer[j] = answer_temp;
        		}
        		
        		if(fail_percentage[i] == fail_percentage[j]) {
        			if(answer[i] < answer[j]) {
        				double temp = fail_percentage[i];
            			fail_percentage[i] = fail_percentage[j];
            			fail_percentage[j] = temp;
            			
            			int answer_temp = answer[i];
            			answer[i] = answer[j];
            			answer[j] = answer_temp;
        			}
        		}
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
//    	int [] array = {2,1,2,6,2,4,3,3};
//		int[] answer = s.solution(5, array);
		
    	int [] array = {1,2,2,1,3};
 		int [] answer = s.solution(8, array);
		

		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}