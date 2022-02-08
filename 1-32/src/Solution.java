import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
  
        String temp;
        
        for(int i = 0; i<strings.length; i++) {
        	for(int j = i+1; j<strings.length ; j++) {
        		int compare = (String.valueOf(strings[i].charAt(n))).compareTo( String.valueOf(strings[j].charAt(n)));
        		if(compare > 0) {
        			temp = strings[i];
        			strings[i] = strings[j];
        			strings[j] = temp;
        		}
        		else if( compare == 0) {
        			if(strings[i].compareTo(strings[j]) < 0) {

            			temp = strings[i];
            			strings[i] = strings[j];
            			strings[j] = temp;
        			}
        		}
        	}
        }
        
        answer = strings;
       
        
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String [] strings = { "abce","abcd", "cdx"};
		int n = 2;
		String [] answer = s.solution(strings, n);
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
