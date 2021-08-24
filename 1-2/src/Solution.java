
class Solution {
    public String solution(String new_id) {
        int length = new_id.length();
        //1단계
        String answer= new_id.toLowerCase();
        //2단계 
        
        String condition = "abcdefghijklmnopqrstuvwxyz1234567890-_.";
        int condition_length = condition.length();
        int non_condition [] = new int[length];
        int count = 0;
        for(int i = 0; i<length; i++) {
        	int condition_count = 0;
        	for(int j = 0; j<condition_length; j++) {
        		if(answer.charAt(i) == condition.charAt(j)) condition_count = 1;
        	}
        	if(condition_count == 0) {
        		non_condition[count] = i;
        		count ++;
        	}
        }
        int sub_count = 0;
        for(int i = 0; i<count;i++) {
        	answer = answer.substring(0, non_condition[i]-sub_count) + answer.substring(non_condition[i]+1-sub_count);
        	sub_count++;
        	System.out.println(non_condition[i]);
        }
        
        //answer = answer.replaceAll("[^a-z0-9-_.]","");
        //3단계 
        answer = answer.replaceAll("[.]{2,}", ".");
        //4단계 
        answer = answer.replaceAll("^[.]|[.]$", "");
        //5단계
        if(answer.equals("")) {
        	answer = "a";
        }
        //6단계
        if(answer.length() >= 16) {
        	answer = answer.substring(0,15);
        	answer = answer.replaceAll("[.]$","");//?
        }
        //7단계
       if(answer.length() <= 2) {
    	   while(answer.length() < 3) {
    		   answer += answer.charAt(answer.length()-1);
    	   }
       }
        return answer;
    }
    public static void main(String[] args) {
		Solution s = new Solution ();
		s.solution("...!@BaT#*..y.abcdefghijklm");
	}
}