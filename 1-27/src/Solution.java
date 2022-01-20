
public class Solution {
    public String solution(String s) {
        String answer = "";
        int count = s.length();
        if(count %2 == 1) {
        	int k = count/2 + 1;
        	answer = s.substring(k-1, k);
        }
        else {
        	int k = count/2;
        	answer = s.substring(k-1, k+1);
        }
        return answer;
    }

}
