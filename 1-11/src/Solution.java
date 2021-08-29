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
        int length = answers.length;
        //a정답
        for(int i = 0; i<length; i++) {
        	int now = i%5;
        	if( a[now] == answers[i]) a_score++;
        }
        //b정답 
        for(int i = 0; i<length; i++) {
        	int now = i%8;
        	if( b[now] == answers[i]) b_score++;
        }
        //c정답
        for(int i = 0; i<length; i++) {
        	int now = i%10;
        	if( c[now] == answers[i]) c_score++;
        }
        
        if( a_score >= b_score) {
        	if(a_score >= c_score) {
        		if(a_score == c_score) {
        			answer.add(1);
        			answer.add(3);
        		}
        		else answer.add(1);
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
        		else answer.add(2);
        	}
        	else answer.add(3);
        }
        answer.sort(null);
        return answer;
    }
    
}

