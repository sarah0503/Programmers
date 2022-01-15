
public class Solution {

    public int solution(int left, int right) {
        int answer = 0;
        for(int k = left; k<right+1; k++) {
            int count = 0;
        for(int i = 1; i<k+1; i++) {
        	if(k%i == 0) {
        		System.out.println(i);
        		count ++;
        	}
        }
        System.out.println("count : " + count);
        if(count %2 == 0) {
        	answer += k;
        }
        else {
        	answer -= k;
        }
        System.out.println(answer);
        }
//        System.out.println();
//    	System.out.println(count);
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(24,27);
	}
}
