
public class Solution {
    public int solution(String s) {
        boolean check = false;
        	if(s.charAt(0) == '+') {
        		s = s.substring(1,s.length());
        	}
        	else if(s.charAt(0) == '-') {
        		check = true;
        		s = s.substring(1,s.length());
        	}
    		int answer = Integer.parseInt(s);
    		if(check == true) {
    			answer -= answer*2;
    		}
    		
        return answer;
    }
    
}

