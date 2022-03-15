import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        
        Map<String, String> nicknames = new HashMap<String, String>();
        
        for(int i = 0; i<record.length;i++) {
        	
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
				"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Solution s = new Solution();
		String [] answer = s.solution(record);
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
