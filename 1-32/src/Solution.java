import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        int [] ranking = new int [strings.length];
        Arrays.sort(strings);
       // Arrays.fill(ranking, -1);
        
//        for(int i  = 0; i<ranking.length; i++) {
//        	System.out.println(ranking[i]);
//        }
        
        
        String [] chracter = new String [strings.length];
        int max;
   
        
        for(int i = 0; i<strings.length; i++) {
        	if (ranking[i] == 0) {
        		//max =  String.valueOf(strings[i].charAt(n));
        		//System.out.println("Q");
        		max = i;
        		for(int j = i+1; j<strings.length;j++) {
        			//System.out.println(j);
        			if(ranking[j] == 0) {
        			int compare = String.valueOf(strings[max].charAt(n)).compareTo( String.valueOf(strings[j].charAt(n)));
        			if(compare < 0) {
        				max = j;
        			}
        			}
        		}
        		ranking[max] = strings.length - i;
        		
        	}else {
        		break;
        	}
        }
        
        for(int i = 0; i<strings.length;i++) {
        	System.out.println(ranking[i]);
        }
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String [] strings = {"abcd", "abce", "cdx"};
		int n = 2;
		String [] answer = s.solution(strings, n);
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
