import java.util.ArrayList;

class Solution {
    public String solution(String[] tables, String[] languages, int[] preference) {
        String answer = "";
        String [] work = {"SI","CONTENTS","HARDWARE","PORTAL","GAME"};
        ArrayList  <String> SI = new ArrayList <String>();
        ArrayList  <String> CONTENTS = new ArrayList <String>();
        ArrayList  <String> HARDWARE = new ArrayList <String>();
        ArrayList  <String> PORTAL = new ArrayList <String>();
        ArrayList  <String> GAME = new ArrayList <String>();
        // 점수 입력
        for(int i = 1; i<6;i ++) {
        	SI.add(tables[0].split(" ")[i]);
        	System.out.println(tables[0].split(" ")[i]);
        }
        for(int i = 1; i<6;i ++) {
        	CONTENTS.add(tables[0].split(" ")[i]);
        	System.out.println(tables[1].split(" ")[i]);
        }
        for(int i = 1; i<6;i ++) {
        	HARDWARE.add(tables[0].split(" ")[i]);
        	System.out.println(tables[2].split(" ")[i]);
        }
        for(int i = 1; i<6;i ++) {
        	PORTAL.add(tables[0].split(" ")[i]);
        	System.out.println(tables[3].split(" ")[i]);
        }
        for(int i = 1; i<6;i ++) {
        	GAME.add(tables[0].split(" ")[i]);
        	System.out.println(tables[4].split(" ")[i]);
        }
        
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