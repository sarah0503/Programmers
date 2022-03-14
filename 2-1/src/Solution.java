import java.util.ArrayList;

public class Solution {
    public int solution(String s) {
    	ArrayList <String> strList = new ArrayList<>();
        int answer = s.length();
        int max = s.length() / 2;
        int count = -1; 
        for(int i = 1; i<max+1; i++) {
    		int start = count+1;
    		boolean check = false;
    		String nowStr = "";
        	for(int j = 0; j<s.length(); j+=i) {
        		try {
        		strList.add(s.substring(j,j+i));
        		}
        		catch(StringIndexOutOfBoundsException e) {
        			strList.add(s.substring(j, s.length()));
        		}
        		count ++;
        		
        	}
        	String checkString = "";
        	int checkCount = 1;
        	for(int j = start; j<count+1; j++) {
        		try {
            	if(strList.get(j).equals(strList.get(j+1))) {
            		checkCount ++;
            		check = true;
            		checkString = strList.get(j);
            	}
            	else {
            		if(check == true) {
            			nowStr = nowStr + checkString+ checkCount ;
            		}else {
            			nowStr += strList.get(j);
            		}
            		check = false;
        			checkCount = 1;
        			checkString = "";
            	}}catch(IndexOutOfBoundsException e) {
            		nowStr += strList.get(j);
            		if(checkCount >1) {
            			nowStr += checkCount;
            		}
            	}
        	}
        	if(nowStr.length() <= answer) {
        		answer = nowStr.length();
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "ababcdcdababcdcd";
		int answer = s.solution(str);
	}

}
