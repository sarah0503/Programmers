import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        s.replaceAll("2","5");
        for(int i = 0; i<10; i++) {
        	s = s.replaceAll(map.get(i), Integer.toString(i));
        	//System.out.println(map.get(i));
        }
        System.out.println(s);
       answer = Integer.parseInt(s);
        return answer;
        
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int a = s.solution("12three4one3");
		System.out.println(a);
	}
}