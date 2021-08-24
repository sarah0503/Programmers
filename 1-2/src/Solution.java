
class Solution {
    public String solution(String new_id) {
        String answer = "";
        int length = new_id.length();
//        for(int i = 0 ;i<length; i++) {
//        	if(new_id.indexOf(i).i)
//        }
        answer= new_id.toLowerCase();
        String condition = "abcdefghijklmnopqrstuvwxyz1234567890-_.";
        int condition_length = condition.length();
        int non_condition [] = new int[length];
        int count = 0;
        for(int i = 0; i<length; i++) {
        	int condition_count = 0;
        	for(int j = 0; j<condition_length; j++) {
        		//System.out.println("av" + answer.charAt(i) + condition.charAt(j));
        		if(answer.charAt(i) == condition.charAt(j)) condition_count = 1;
        	}
        	if(condition_count == 0) {
        		non_condition[count] = i;
        		count ++;
        	}
        }
        int sub_count = 0;
        for(int i = 0; i<count;i++) {
//        	answer = answer.deleteCharAt(non_condition[i] + count);
        	answer = answer.substring(0, non_condition[i]-sub_count) + answer.substring(non_condition[i]+1-sub_count);
        	sub_count++;
        	System.out.println(non_condition[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
		Solution s = new Solution ();
		s.solution("...!@BaT#*..y.abcdefghijklm");
	}
}