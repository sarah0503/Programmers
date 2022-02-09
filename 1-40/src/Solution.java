
public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++) {
        	if(s.charAt(i) == ' ') {
        		answer += ' ';
        	}
        	else {
            	char point = (char) ((int) s.charAt(i)+ n);
            	if(point >= 123) {
            		point -= 26;
            	}
            	else if(point >= 91 && Character.isUpperCase(s.charAt(i)) == true) {
            		point -= 26;
            	}
            	answer += point;
        	}
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		String s = "a B z";
		//String s = "z";
		int n = 4;
		String answer = sol.solution(s, n);
		System.out.println(answer);
		
	}

}
