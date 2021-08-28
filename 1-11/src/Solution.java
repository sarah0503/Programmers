import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] answers) {
        ArrayList <Integer> answer = new ArrayList<Integer>();
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int a_score = 0;
        int b_score = 0;
        int c_score = 0;
        //a계산
        for(int i = 0; i<5 ; i++) {
        	if(a[i] == answers[i]) a_score ++;
        }
        a_score = a_score *8;
        int [] temp_answers = new int[40];
        //c계산
        for(int i = 0 ;i<2; i++) {
        	for(int j = 0; j<5 ;j++) {
        		temp_answers[i*5 + j] = answers[j];
        		//System.out.println(temp_answers[i*5 + j]);
        	}
        }
        for(int i = 0; i<10; i++) {
        	if(c[i] == temp_answers[i]) c_score ++;
        	System.out.println(c[i]);
        	System.out.println(temp_answers[i]);
        	System.out.println();
        }
        c_score = c_score*4;
        //b계산
        for(int i = 0 ;i<4; i++) {
        	for(int j = 0; j<10 ;j++) {
        		temp_answers[i*10 + j] = temp_answers[j];
        		//System.out.println(temp_answers[i*10 + j]);
        	}
        }
        int [] temp_b = new int[40];
        for(int i = 0 ;i<5; i++) {
        	for(int j = 0; j<8 ;j++) {
        		temp_b[i*8 + j] = b[j];
        	}
        }       
        
        for(int i = 0; i<40; i++) {
        	if(temp_b[i] == temp_answers[i]) b_score ++;
        }
        System.out.println(a_score);
        System.out.println(b_score);
        System.out.println(c_score);
        if( a_score >= b_score) {
        	if(a_score >= c_score) {
        		if(a_score == c_score) {
        			answer.add(1);
        			answer.add(3);
        		}
    			answer.add(1);
        	}
        	else {
        		answer.add(3);
        	}
        	
        	if(a_score == b_score) answer.add(2);
        }
        else {
        	if(b_score >= c_score) {
        		if(b_score == c_score) {
        			answer.add(2);
        			answer.add(3);
        		}
        		answer.add(2);
        	}
        	else answer.add(3);
        }
        answer.sort(null);
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] arg = {1,3,2,4,2};
		//s.solution(arg);
		System.out.println(s.solution(arg));
	}
}
