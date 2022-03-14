import java.util.ArrayList;

public class Solution {
    public int solution(String s) {
    	ArrayList <String> strList = new ArrayList<>();
        int answer = s.length();
        int max = s.length() / 2;
        int count = -1; 
        for(int i = 1; i<max; i++) {
    		int start = count+1;
        	for(int j = 0; j<s.length(); j+=i) {
        		try {
        		strList.add(s.substring(j,j+i));
        		System.out.println(s.substring(j,j+i));}
        		catch(StringIndexOutOfBoundsException e) {
        			strList.add(s.substring(j, s.length()));
        			System.out.println(s.substring(j, s.length()));
        		}
        		count ++;
        		
        	}
        	System.out.println(count);
        	System.out.println(start);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "ababcdcdababcdcd";
		int answer = s.solution(str);
		System.out.println(answer);
	}

}
