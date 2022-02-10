
public class Solution {
    public String solution(String s) {
        String answer = "";
        String [] array = s.split(" ", -1);
        for(int i = 0;i<array.length; i++) {
        	for(int j = 0; j<array[i].length(); j++) {
        		if(j == 0) {
        			answer += String.valueOf(array[i].charAt(j)).toUpperCase();
        		}else if( j%2 == 0){
        			answer += String.valueOf(array[i].charAt(j)).toUpperCase();
        		}else {
        			answer += String.valueOf(array[i].charAt(j)).toLowerCase();
        		}
        	}
        	answer += " ";
        }
       answer  = answer.replaceFirst(".$","");
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String answer = s.solution("try hello world");
		System.out.println(answer);
	}
}
