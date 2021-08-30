import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
//        int [] temp = new int [n];
//        int count = 0;
        ArrayList <Integer>temp = new ArrayList<Integer>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int lost_people = lost.length;
        //예외
        for(int i = 0; i<lost.length;i++) {
        	for(int j = 0; j<reserve.length; j++) {
        		if(lost[i] == reserve[j])
        		temp.add(lost[i]);
    			reserve[j] = 0;
        		lost_people --;
        		System.out.println(lost[i]);
        		System.out.println(reserve[j]);
        		System.out.println("a");
        	}
        }
        for(int i = 0; i<lost.length; i++) {
        	for(int j = 0; j<reserve.length; j++) {
        		int num = Math.abs(lost[i]-reserve[j]);
        		if(num == 1) {
        			lost_people--;
        			reserve[j] = 0;
        			break;
        		}
        	}
        }
        answer = n - lost_people;
        return answer;
    }
    public static void main(String[] args) {
		int n = 5;
		int [] lost = {2,4};
		int [] reserve = {1,3,5};
		Solution s = new Solution();
		//s.solution(n, lost, reserve);
		System.out.println(s.solution(n, lost, reserve));
	}
}