
public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i = 0; 
        for( i = 0; i<phone_number.length() - 4; i++) {
        	answer += "*";
        }
        for(; i<phone_number.length(); i++) {
        	answer += phone_number.charAt(i);
        }
        return answer;
    }
    
    public static void main(String[] args) {
		String phone_number = "01033334444";
		Solution s = new Solution();
		String answer = s.solution(phone_number);
		System.out.println(answer);
	}
}
