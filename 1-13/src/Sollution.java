import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] tables, String[] languages, int[] preference) {
        String answer = "";
        HashMap <String, Integer> SI = new  HashMap <String, Integer>();
        HashMap <String, Integer> CONTENTS = new  HashMap <String, Integer>();
        HashMap <String, Integer> HARDWARE = new  HashMap <String, Integer>();
        HashMap <String, Integer> PORTAL = new  HashMap <String, Integer>();
        HashMap <String, Integer> GAME = new HashMap <String, Integer>();
        int length = languages.length;
        HashMap <String, Integer> language = new HashMap <String, Integer>();
        HashMap <String, Integer> score = new HashMap <String, Integer>();
        HashMap <String, Integer> pre = new HashMap <String, Integer>();

        //선호도 입력
        for(int i = 0; i<length; i++) {
        	pre.put(languages[i], preference[i]);
        }
        //점수 계산
        for(int j = 1; j<6; j++) {
        	SI.put(tables[0].split(" ")[j], 6-j);
        }
        for(int j = 1; j<6; j++) {
        	CONTENTS.put(tables[1].split(" ")[j], 6-j);
        }
        for(int j = 1; j<6; j++) {
        	HARDWARE.put(tables[2].split(" ")[j], 6-j);
        }
        for(int j = 1; j<6; j++) {
        	PORTAL.put(tables[3].split(" ")[j], 6-j);
        }
        for(int j = 1; j<6; j++) {
         	GAME.put(tables[4].split(" ")[j], 6-j);
        }
        
        //언어 넣기
        for(int i = 0 ;i<length ; i++) {
        	int leng_score = 0;
        	if(score.containsKey(languages[i])) {
        		leng_score = score.get(languages[i]);
        	}
        	leng_score += preference[i];
        	language.put(languages[i], leng_score);
        }

        //직업군 계산
        int si = 0, contents=0, hardware=0,portal=0,game = 0;
        
        Iterator <String> iter = SI.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	for(int i = 0; i<length; i++) {
        		if(key.equals(languages[i])) {
        			si += SI.get(languages[i]) * pre.get(languages[i]);
        		}
        	}
        }
        iter = CONTENTS.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	for(int i = 0; i<length; i++) {
        		if(key.equals(languages[i])) {
        			contents+= CONTENTS.get(languages[i]) * pre.get(languages[i]);
        		}
        	}
        }
        iter = HARDWARE.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	for(int i = 0; i<length; i++) {
        		if(key.equals(languages[i])) {
        			hardware+= HARDWARE.get(languages[i]) * pre.get(languages[i]);
        		}
        	}
        }
        iter = PORTAL.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	for(int i = 0; i<length; i++) {
        		if(key.equals(languages[i])) {
        			portal+= PORTAL.get(languages[i]) * pre.get(languages[i]);
        		}
        	}
        }
        iter = GAME.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	for(int i = 0; i<length; i++) {
        		if(key.equals(languages[i])) {
        			game+= GAME.get(languages[i]) * pre.get(languages[i]);
        		}
        	}
        }
        
        Map <String, Integer> SCORE = new HashMap<String, Integer>();
        SCORE.put("SI",si);
        SCORE.put("CONTENTS", contents);
        SCORE.put("HARDWARE", hardware);
        SCORE.put("PORTAL", portal);
        SCORE.put("GAME", game);
        
        ArrayList<String> answers = new ArrayList<String> ();
        int maxValue = Collections.max(SCORE.values());
        for(Map.Entry<String, Integer> m : SCORE.entrySet()) {
        	if(m.getValue() == maxValue) {
        		answers.add(m.getKey());
        	
        	}
        }
        Collections.sort(answers);
        answer = answers.get(0);
        
        
        return answer;
    }
}