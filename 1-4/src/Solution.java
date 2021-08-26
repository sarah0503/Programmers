class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left_state = 10;
        int right_state = 12;
        int left_leng = 0;
        int right_leng = 0;
        int length = numbers.length;
        for(int i = 0; i<length; i++) {
        	if(numbers[i] ==0 ) numbers[i] = 11;
        	
        	if(numbers[i]%3 == 1) {
        		answer += "L";
        		left_state = numbers[i];
        	}
        	else if(numbers[i]%3 == 0) {
        		answer += "R";
        		right_state = numbers[i];
        	}
        	else {
        		left_leng = 0;
        		right_leng=0;	
        		int abc = Math.abs(left_state - numbers[i]);
        		//left_leng = abc;
        		while(abc >=3) {
        			abc -=3;
        			left_leng +=1;
        		}
        		left_leng += abc;
        		
        		abc = Math.abs(right_state - numbers[i]);
        		while(abc>=3) {
        			abc -=3;
        			right_leng += 1;
        		}
        		right_leng += abc;
        		//System.out.println("left : " + left_leng);
        		//System.out.println("right : " + right_leng);
        		if(left_leng<right_leng) {
        			answer+="L";
        			left_state = numbers[i];
        		}
        		else if(left_leng > right_leng) {
        			answer += "R";
        			right_state = numbers[i];
        		}
        		else {
        			if(hand.equals("left")) {
            			answer+="L";
            			left_state = numbers[i];
        			}
        			else {
            			answer += "R";
            			right_state = numbers[i];
        			}
        		}
        	}
        	//System.out.println(answer);
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int [] a = {7,0,8,2,8,3,1,5,7,6,2};
		System.out.println(s.solution(a,"left"));
		//s.solution(a,"right");
	}
}