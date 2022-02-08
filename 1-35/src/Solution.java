
public class Solution {
	
    public boolean solution(String s) {
        boolean answer = false;
        if( s.length() ==4  || s.length() == 6) {
        for(int i = 0; i<s.length(); i++) {
        	if(Character.isDigit(s.charAt(i)) == false) return false;
        }
            answer = true;
        }
        return answer;
    }
    

}

