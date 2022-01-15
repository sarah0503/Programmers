import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Solution {
	
    public int[] solution(String[] id_list, String[] report_array, int k) {
        int people_count = id_list.length;
        int [] count = {};
        int[] answer = new int[people_count];
        HashSet<String> report = new HashSet<>(Arrays.asList(report_array));
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
//        for(int i = 0; i<report.size(); i++) {
//        	String people = report[i].split(" ")[1];
//        	int num = people_map.get(people) + 1;
//        	people_map.put(people, num);
//        }
        
       Iterator <String> it1 = report.iterator();
       while(it1.hasNext()) {
    	   String r = it1.next().toString();
    	   System.out.println(r);
    	   String people = r.split(" ")[1];
	       int num = people_map.get(people) + 1;
	       people_map.put(people, num);
       }
        
//        for(int i = 0; i<report.size();i++) {
//        	String person2 = report[i].split(" ")[1];
//        	if(people_map.get(person2) >= k) {
//        		String person1 = report[i].split(" ")[0];
//        		int num = people_number.get(person1);
//        		answer[num] ++;
//        	}
//        }
       
       Iterator <String> it2 = report.iterator();
       while(it1.hasNext()) {
    	   String r = it2.next().toString();
    	   String person2 = r.split(" ")[1];
    	   if(people_map.get(person2) >= k) {
    		   String person1 = r.split(" ")[0];
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
		s.solution(id_list, report, 3);
	}

}
