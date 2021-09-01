import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public String solution(String[] tables, String[] languages, int[] preference) {
        String answer = "";
       // String [] work = {"SI","CONTENTS","HARDWARE","PORTAL","GAME"};
//        ArrayList  <String> SI = new ArrayList <String>();
//        ArrayList  <String> CONTENTS = new ArrayList <String>();
//        ArrayList  <String> HARDWARE = new ArrayList <String>();
//        ArrayList  <String> PORTAL = new ArrayList <String>();
//        ArrayList  <String> GAME = new ArrayList <String>();
        int length = languages.length;
        HashMap <String, Integer> language = new HashMap <String, Integer>();
        HashMap <String, Integer> score = new HashMap <String, Integer>();
        //ArrayList  <String> []  lang = null ;
        for(int i = 0; i<5; i++) {
        	for(int j = 1; j<6; j++) {
        		if(score.containsKey(tables[i].split(" ")[j])) {
        			score.replace(tables[i].split(" ")[j], score.get(tables[i].split(" ")[j]) + (6-j));
        		} 
        		else {
        			score.put(tables[i].split(" ")[j], 6-j);
        		}
        	}
        }
        
        for(int i = 0 ;i<length ; i++) {
        	int leng_score = 0;
        	if(score.containsKey(languages[i])) {
        		leng_score = score.get(languages[i]);
        	}
        	//leng_score += preference[i];
        	language.put(languages[i], leng_score);
        }
        
        
        Iterator <String> iter = language.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	Integer value = (Integer)language.get(key);
        	System.out.println(key + " " + value);
        }
        // 점수 입력
        
        return answer;
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	String [] tables = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String [] languages = {"PYTHON", "C++", "SQL"};
		int [] preference = {7, 5, 5};
    	s.solution(tables, languages, preference);
	}
    
}