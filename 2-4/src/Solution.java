
public class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        int na = 0;
        
        while( n!=0) {
        	na = n%3;
        	
        	n = n/3;
        	
        	if(na == 0) {
        		n = n-1;
        		na = 4;
        	}
            sb.insert(0,na);
        }
        String answer = sb.toString();
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(14));
	}
    
}
