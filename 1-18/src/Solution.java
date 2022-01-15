import java.util.TreeMap;

public class Solution {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int people_count = id_list.length;
        int [] count = {};
        int[] answer = new int[people_count];
        TreeMap <String, Integer> people_number = new TreeMap <String, Integer> ();
        TreeMap <String, Integer> people_map = new TreeMap <String, Integer> ();
        //초기화 
        for(int i = 0; i<people_count; i++) {
        	String people = id_list[i];
        	people_number.put(people, i);
        	people_map.put(people, 0);
        	answer[i] = 0;
        }
        //경고 누적
        for(int i = 0; i<report.length; i++) {
        	String people = report[i].split(" ")[1];
        	//System.out.println(people);
        	int num = people_map.get(people) + 1;
        	people_map.put(people, num);
        	//System.out.println(num);
        }
        for(int i = 0; i<report.length;i++) {
        	String person2 = report[i].split(" ")[1];
        	if(people_map.get(person2) >= k) {
        		String person1 = report[i].split(" ")[0];
        		int num = people_number.get(person1);
        		answer[num] ++;
        	}
        }
        
        for(int i = 0; i<answer.length;i++) {
        	System.out.println(answer[i]);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] id_list = {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		Solution s = new Solution();
		s.solution(id_list, report, 2);
	}

}
