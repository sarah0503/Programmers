
public class Solution {

    public int solution(int left, int right) {
        int answer = 0;
        for(int k = left; k<right+1; k++) {
            int count = 0;
        for(int i = 1; i<k+1; i++) {
        	if(k%i == 0) {
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
        }
        return answer;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(24,27);
	}
}
